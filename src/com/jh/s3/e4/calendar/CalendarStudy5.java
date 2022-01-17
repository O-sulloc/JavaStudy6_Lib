package com.jh.s3.e4.calendar;

import java.util.Calendar;

public class CalendarStudy5 {

	public static void main(String[] args) {

		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTime());
		// 카택 탓더니 30분 걸린대
		// 도착예정시간은 몇시몇분?

		long time = ca.getTimeInMillis();
		time = time + (1000 * 60 * 30);
		ca.setTimeInMillis(time);
		System.out.println(ca.getTime());

		ca.roll(Calendar.MINUTE, 70);
		System.out.println(ca.getTime());

		ca.add(Calendar.MINUTE, 70);
		System.out.println(ca.getTime());
		String pattern = "yyyy년 MM월 dd일 - HH시 ";
	}

}
