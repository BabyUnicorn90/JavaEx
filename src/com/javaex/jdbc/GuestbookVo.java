package com.javaex.jdbc;

import java.util.Date;

//DTO(VO: 객체간 데이터 전송을 위한 값 객체)
//필드, getter/setter, 기본생성
//부가적: toString, equals 정도만 구현
//로직 코드는 작성하지 않음
public class GuestbookVo {
	//field
	private Long no;     //VO에서는 기본타입 사용 X 
	private String name;
	private String password;
	private String message;
	private Date regDate;    //import java.util.Date
	
	//생성자: VO에서는 반드시 기본생성자 있어야 함. 
	public GuestbookVo(Long no, String name, String password, String message, Date regDate) {
		super();
		this.no = no;
		this.name = name;
		this.password = password;
		this.message = message;
		this.regDate = regDate;
	}
	
	public GuestbookVo() {
		//기본생성자
	}
	
	
	//Getter/Setter
	public long getNo() {
		return no;
	}
	
	public void setNo(long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
	@Override
	public String toString() {
		return "GuestbookVo [no=" + no + ", name=" + name + ", password=" + password + ", message=" + message
				+ ", regDate=" + regDate + "]";
	}	
}
