package com.jh.s3.e4.calendar;

import java.util.Calendar;

public class CalendarStudy4 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		long today1 = today.getTimeInMillis();

		Calendar bday = Calendar.getInstance();
		bday.set(1996, 11, 16);
		long bday1 = bday.getTimeInMillis();

		long date = (today1 - bday1) / 24 / 60 / 60 / 1000;
		System.out.println(date + "칠째 살아가는 중");

		long age = date / 365;
		System.out.println("대충 " + age + "살 먹었군");
	}

}
