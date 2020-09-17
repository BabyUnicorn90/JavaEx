package com.javaex.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalenderEx {

	public static void main(String[] args) {
//		dateEx();
		calendarEx();
	}
	
	
	private static void calendarEx() {
		//캘린더 불러오기
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
		
		
		//Custom Calendar에 날짜 정보 변경: set(상수, 값)
		custom.set(1999, 12, 31);
		
		//날짜 정보의 확인: get(상수)
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;  //주의: 월 정보는 0부터 시작!
		int date = now.get(Calendar.DATE);
		
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.%n", year, month, date);
		
		//날짜의 연산
		//100일 뒤로 이동
		Calendar future = Calendar.getInstance(); //현재
		future.add(Calendar.DATE, 100);
		
		System.out.printf("100일 뒤: %d년 %d월 %d일%n", 
				future.get(Calendar.YEAR), 
				future.get(Calendar.MONTH) + 1, 
				future.get(Calendar.DATE));
		
		//상기 날짜의 요일 구하기
		//1: 일요일
		int dow = future.get(Calendar.DAY_OF_WEEK);
		System.out.println("100일 뒤의 요일: " + dow);
		
		System.out.println("이날은 토요일인가? " + (dow == Calendar.SATURDAY));
	}
	
	
	private static void dateEx() {
		//날짜 얻어오기
		Date now = new Date(); //현재 날짜와 시간
		
		System.out.println("현재: " + now);
		
		//날짜 포맷팅 --FULL, LONG, MEDIUM, SHORT
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("FULL 포맷: " + df.format(now));

		DateFormat df1 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("LONG 포맷: " + df1.format(now));
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("MEDIUM 포맷: " + df2.format(now));

		DateFormat df3 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("SHORT 포맷: " + df3.format(now));
		
		//사용자 정의 포맷: SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println("사용자 정의 포맷: " + sdf.format(now));
	}

}
