package com.jh.s3.e4.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarStudy1 {

	public static void main(String[] args) {
		// Calendar는 추상클래스라 객체를 만들 수 없음
		// 그래서 누군가 상속을 받아야 함
		// 그래서 gregorian calendar가 calendar 클래스를 상속받았다
		// 따라서 calendar 클래스에 있는 메서드는 gregoriancalendar에도 있다.

		GregorianCalendar gc = new GregorianCalendar();
		// 이렇게 객체를 만들어야 사용할 수 있음.

		Calendar calendar = new GregorianCalendar();
		// 이건 부모 칼렌타입에 정의된 메서드만 사용할 수 있음. 당연함
		// 내가 부모인데 자식걸 쓸 순 없음

		Calendar ca = Calendar.getInstance();
		// 이렇게 부모 타입이 캘린더이지만 실제로 사용하는건 그레고리안임.
		// 그 오버라이딩?그거라서

		int y = ca.get(Calendar.YEAR);
		int m = ca.get(Calendar.MONTH);
		int d = ca.get(Calendar.DATE);

		int h = ca.get(Calendar.HOUR);
		int hh = ca.get(Calendar.HOUR_OF_DAY);
		int mm = ca.get(Calendar.MINUTE);
		int ss = ca.get(Calendar.SECOND);
		int ms = ca.get(Calendar.MILLISECOND);
		long millis = ca.getTimeInMillis();
		
		Date date = ca.getTime();

		System.out.println("m: " + (m + 1));
		System.out.println("d: " + d);
		System.out.println("h: " + hh);
		System.out.println(mm);
		System.out.println(ss);
		System.out.println(date);
	}

}
