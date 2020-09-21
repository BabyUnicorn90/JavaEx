package com.javaex.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class GuestbookDaoimpl implements GuestbookDao {
    String dburl = "jdbc:mariadb://192.168.1.107:3306/mysite?useSSL=false";
    String dbuser = "mysite";
    String dbpass = "mysite";
    
    //공통메서드: 접속
    private Connection getConnection() throws SQLException {
    	Connection conn = null;
    	try {
    		//드라이버로드
    		Class.forName("org.mariadb.jdbc.Driver");
    		
        	//접속객체 생성 -> return
    		conn = DriverManager.getConnection(dburl, dbuser, dbpass);
    	}catch (ClassNotFoundException e) {
    		System.err.println("접속 실패");
    	}
    	return conn;
    }
    
    
    @Override
	public List<GuestbookVo> searchAll() {
		//SELECT ... FROM guestbook ORDER BY reg_date DESC
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		List<GuestbookVo> list = new ArrayList<>();
		
		String sql = "SELECT no, name, password, message, reg_time " 
						+ "FROM guestbook ORDER BY reg_time DESC";
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			//커서구문
			while(rs.next()) {
				Long no = rs.getLong(1);
				String name = rs.getString(2);
				String password = rs.getString(3);
				String message = rs.getString(4);
				Date regDate = rs.getDate(5);
				
				//Vo 생성
				GuestbookVo vo = new GuestbookVo(no, name, password, message, regDate);
				
				//반환할 list에 VO추가
				list.add(vo);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;    //resultSet는 list객체 반환  
    }

	@Override
	public int insert(GuestbookVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;    //INSERT, UPDATE, DELETE 쿼리는 영향을 받은 레코드의 카운트를 리턴

		try {
			conn = getConnection();
			String sql = "INSERT INTO guestbook (name, password, message, reg_time)" + "VALUES (?, ?, ?, now)";  //SQL 실행계획
			pstmt = conn.prepareStatement(sql);
			
			//동적데이터 연결
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getMessage());
			
			//실행: INSERT, UPDATE, DELETE   -> executeUpdate()
			insertedCount = pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return insertedCount;
	}

	@Override
	public int update(GuestbookVo vo) {
		// TODO 연습문제
		return 0;
	}

	@Override
	public int delete(Long no, String password) {
		// TODO 연습문제
		return 0;
	}

	@Override
	//SQL) WHERE ... LIKE
	public List<GuestbookVo> searchByKeyword(String keyword) {
		List<GuestbookVo> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT no, name, password, message, reg_time FROM guestbook" 
				+ "WHERE name LIKE ? OR messge LIKE ?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "%" + keyword + "%");
			pstmt.setString(2, "%" + keyword + "%");
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Long no = rs.getLong(1);
				String name = rs.getString(2);
				String password = rs.getString(3);
				String message = rs.getString(4);
				Date reg_time = rs.getDate(5);
				
				GuestbookVo vo = new GuestbookVo(no, name, password, message, reg_time);
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

}
