package com.jh.s3.e4.calendar;

import java.util.Calendar;

public class CaldendarStudy2 {

	public static void main(String[] args) {
		// 현재 시간
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTime());

		// 시간 변경해보기
		Calendar ca2 = Calendar.getInstance();
		ca2.set(Calendar.DATE, 15);
		ca2.set(Calendar.YEAR, 2023);
		ca2.set(Calendar.MONTH, 1);
		ca2.setTimeInMillis(0);
		System.out.println(ca2.getTime());
	}

}
