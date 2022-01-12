package com.jh.s1.lang.Wrapper;

import java.util.Scanner;

public class WrapperEx1 {
	private Scanner sc = new Scanner(System.in);

	public void ex2() {
		// 주민번호 검증하기
		System.out.println("주민등록번호를 입력하세요");
		// String number = sc.next();
		// System.out.println(number);
		String number = "961212-1234567";

		for (int i = 0; i < number.length(); i++) {
			char num = number.charAt(i);
			if (num != '-') {
				int num_int = Integer.parseInt(String.valueOf(num));
			}

		}

		for (int i = 2; i < 10; i++) {

		}

	}

	public void ex1() {
		// 키보드로부터 주민등록번호 입력받기
		// 2022-출생년도 빼서 나이 대충 구하기
		// 남자인지 여자인지
		// 993232-1234333
		System.out.println("주민등록번호를 입력하세요");
		String number = sc.next();
		String[] result = number.split("-");

		for (int i = 0; i < result.length; i++) {
			result[i].trim();
		}
		String front_yy = result[0].substring(0, 2);
		String back = result[1].substring(0, 1);
		String month = result[0].substring(2, 4);

		int yy_int = Integer.parseInt(front_yy);
		int back_int = Integer.parseInt(back);
		int month_int = Integer.parseInt(month);
		int y22 = 2022;

		// int season = Integer.parseInt(result[0].substring(2, 4));
		// 이렇게 해도 됨

		if (back_int == 1 || back_int == 2) {
			System.out.println("2000년 이전 출생자입니다.");
			int yy = 1900 + yy_int;
			int age = y22 - yy;
			System.out.println("나이: " + age);
		} else if (back_int == 3 || back_int == 4) {
			System.out.println("2000년 이후 출생자입니다.");
			int yy = 2000 + yy_int;
			int age = y22 - yy;
			System.out.println("나이: " + age);
		}
		if (back_int == 2 || back_int == 4) {
			String sex = "여";
			System.out.println("성별: " + sex);
		} else if (back_int == 1 || back_int == 3) {
			String sex = "남";
			System.out.println("성별: " + sex);
		}
		if (month_int >= 3 && month_int <= 5) {
			System.out.println("봄에 태어남");
		} else if (month_int == 6 || month_int == 7 || month_int == 8) {
			System.out.println("여름에 태어남");
		} else if (month_int == 9 || month_int == 10 || month_int == 11) {
			System.out.println("가을에 태어남");
		} else if (month_int == 12 || month_int == 1 || month_int == 2) {
			System.out.println("겨울에 태어남");
		}
	}
}
