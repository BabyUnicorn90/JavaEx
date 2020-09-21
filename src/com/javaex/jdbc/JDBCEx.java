package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class JDBCEx {

   public static void main(String[] args) {
//      selectTest();
//	    guestbookSelectAll();
	   	guestbookInsert();
	    guestbookSearch();
   }

   private static void guestbookDelete() {
	   //방명록 번호와 비밀번호를 입력받아 delete 하기 --연습문제
   } 
   
   private static void guestbookUpdate() {
	   //방명록 번호와 내용을 입력받아 update 하기    --연습문제
   }
   
   
   private static void guestbookSearch() {
	   //키원드 받아서 검색 수행
	   guestbookSelectAll();
	   GuestbookDao dao = new GuestbookDaoimpl();
	   
	   Scanner scanner = new Scanner(System.in);
	   System.out.print("검색어");
	   String keyword = scanner.next();
	   
	   List<GuestbookVo> list = dao.searchByKeyword(keyword);
	   
	   System.out.println("[검색결과]");
	   
	   for (GuestbookVo vo:list) {
		   System.out.println("\t" + vo);		   
	   }
	   scanner.close();
   }
   
   
   private static void guestbookInsert() {
	   //스캐너로부터 입력을 받아서 guestbook table에 등록
	   guestbookSelectAll();
	   GuestbookDao dao = new GuestbookDaoimpl();
	   
	   Scanner scanner = new Scanner(System.in);
	   System.out.print("이름: ");
	   String name = scanner.next();
	   System.out.print("비밀번호: ");
	   String password = scanner.next();
	   System.out.print("메시지(단어): ");
	   String message = scanner.next();
	   
	   //DAO 생성
	   GuestbookVo vo = new GuestbookVo(null,     //no필드는 pk값
			   name, password, message, 
			   null);                             //times필드는 now()로 세팅
	   int insertedCount = dao.insert(vo);
	   
	   System.out.println(insertedCount + "개의 레코드가 추가되었습니다.");
	   
	   guestbookSelectAll();
	   scanner.close();
   }
   
   
   private static void guestbookSelectAll() {
	   //DAO 생성
	   //비즈니스 로직과 가장 로직을 분리
	   GuestbookDao dao = new GuestbookDaoimpl();
	   List<GuestbookVo> list = dao.searchAll();
	   
	   System.out.println("[방명록]");
	   for (GuestbookVo vo:list) {
		   System.out.println("\t" + vo);
	   }
	   System.out.println("==============================");
	   
   }
   
   
   private static void selectTest() {
      // 1. 드라이버 로드
      // 2. Connection
      // 3. Statement
      // 4. 쿼리 수행
      // 5. 결과 처리
      // 6. 자원정리
      
      // employees 데이터베이스의 employees 테이블로부터 모든 레코드를 받아서 출력
      String dburl = "jdbc:mariadb://192.168.1.107:3306/employees?useSSL=false";
      String dbuser = "employees";
      String dbpass = "employees";
      
      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;
            
      try {
          // 1. 드라이버 로드
    	  Class.forName("org.mariadb.jdbc.Driver");
          // 2. Connection
    	  conn = DriverManager.getConnection(dburl, dbuser, dbpass);
          // 3. Statement
    	  String sql = "SELECT emp_no, first_name, last_name, birth_date FROM employees";
          stmt = conn.createStatement();    //statement 생성
    	  // 4. 쿼리 수행
    	  rs = stmt.executeQuery(sql);
          // 5. 결과 처리
    	  while(rs.next()) { //커서에서 다음 레코드 받아오기
    		  //컬럼 데이터 받아오기
    		  Long no = rs.getLong(1);   //숫자 인덱스 (1부터)
    		  String firstName = rs.getString("first_name");  //문자인덱스 (컬럼명)
    		  String lastName = rs.getNString("last_name");
    		  Date birthDate = rs.getDate(4);  //java.util.Date로 import
    		  
    		  SimpleDateFormat sdf = new SimpleDateFormat("YYYY-mm-dd");
    		  System.out.printf(("%d - %s %s (생일: %s)%n"), no, firstName, lastName, sdf.format(birthDate));
    		  }
    	  } catch (ClassNotFoundException e) {
    		  System.err.println("드라이버 로드 실패!");
    	  } catch (SQLException e) {
    		  e.printStackTrace();
    	  } finally {
          // 6. 자원정리
      		try {
      			rs.close();
      			stmt.close();
      			conn.close();
      		} catch (SQLException e) {
      			e.printStackTrace();
      		}
      }
   }
}





