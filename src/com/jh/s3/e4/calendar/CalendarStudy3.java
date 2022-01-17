package com.jh.s3.e4.calendar;

import java.util.Calendar;

public class CalendarStudy3 {

	public static void main(String[] args) {
		// 1초는 = 1000밀리세컨즈
		// 1분은 = 60초 = 60000밀리세컨즈
		// 1시간은 = 60분 = 3600초 = 216000000
		// 하루는 = 24시간 =
		// 1년은 = 365일
		//System.out.println(1000 * 60 * 60 * 24 * 365);

		// 현재 시간 ->밀세로 바꿔
		Calendar ca = Calendar.getInstance();

		// 현재시간 -> 2시간 뒤 -> 밀세로 바꿔
		Calendar ca2 = Calendar.getInstance();
		ca2.set(Calendar.HOUR, 5);
		long l1 = ca.getTimeInMillis();
		long l2 = ca2.getTimeInMillis();
		long result = l2 - l1;
		System.out.println(result);
		// 두개 빼기해서 시간차 밀세로 구해

		long hour = result/60/60/1000;
		System.out.println(hour);
	}

}
