package com.jh.s1.lang.Wrapper;

import java.util.Scanner;

public class WrapperEx1 {
	public void ex2() {
		// 주민번호 검증하기

	}

	public void ex1() {
		// 키보드로부터 주민등록번호 입력받기
		Scanner sc = new Scanner(System.in);
		// 2022-출생년도 빼서 나이 대충 구하기
		// 남자인지 여자인지
		// 993232-1234333
		System.out.println("주민등록번호를 입력하세요");
		String number = sc.next();
		String[] result = number.split("-");

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i].trim());
		}
		String front_yy = result[0].substring(0, 2);
		String back = result[1].substring(0, 1);

		int yy_int = Integer.parseInt(front_yy);
		int back_int = Integer.parseInt(back);

		if (back_int == 1 && back_int == 2) {
			System.out.println("1,2이다");
//			int yy = 1900 + yy_int;
//			System.out.println(yy);

//			int age = y22 - yy_int - 1900;
//			System.out.println("나이: " + age);
		}
	}
}
