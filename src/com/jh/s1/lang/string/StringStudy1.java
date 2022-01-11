package com.jh.s1.lang.string;

import java.util.Scanner;

public class StringStudy1 {

	public void splitTest() {
		String name = "jh, bp, ld, babo";
		String[] names = name.split(",");

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i].trim());
		}
	}

	public void trimTest() {
		String title = "    West Side Story ";
		String result = title.trim();
		System.out.println(result);
	}

	public void caseTest() {
		String title = "West Side Story";
		String result = title.toLowerCase();
		String result2 = title.toUpperCase();
		System.out.println(result);
		System.out.println(result2);
	}

	public void replaceTest() {
		String title = "West Side Story";
		String result = title.replace('S', 't');
		System.out.println(title);
		System.out.println(result);

	}

	public void subStringEx1() {

//		String[] image = new String[] { "jpg", "gif", "png" };
//		String[] doc = new String[] { "txt", "pdf", "hwp" };
//		String[] music = new String[] { "mp3", "wav", "ogg" };

		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력하세요.");
		String name = sc.next();
		int num = name.lastIndexOf('.') + 1;

		String file = name.substring(num);
		if (file.equals("jpg") || file.equals("gif") || file.equals("png")) {
			System.out.println("이미지 파일입니다.");
		} else if (file.equals("txt") || file.equals("pdf") || file.equals("hwp")) {
			System.out.println("문서 파일입니다.");
		} else if (file.equals("mp3") || file.equals("wav") || file.equals("ogg")) {
			System.out.println("음원 파일입니다.");
		} else {
			System.out.println("알 수 없는 파일입니다.");
		}
	}

	public void lengthTest() {
		String title = "West Side Story";
		int len = title.length();

		String find = "e";
		int count = 0;
		for (int i = 0; i < title.length(); i++) {
			int index = title.indexOf(find, i);
			if (index > 0) {
				count++;
				i = index;
			} else {
				break;
			}

		}
		System.out.println("couhnt: " + count);
		// 한글자씩 출력해보삼
//		for (int i = 0; i < title.length(); i++) {
//			System.out.println(title.charAt(i));
//		}
	}

	public void indexOfTest() {
		String msg = "hello world";
		// indexof를 호출해보삼
		int num = msg.indexOf('l');
		System.out.println(num);
	}

	public void equalTest() {
		String str = "bp";
		String str2 = "bp";
		String str3 = new String("bp");
		String str4 = new String("bp");

		System.out.println(str == str2);
		System.out.println(str3 == str4);
		System.out.println(str == str3);
		System.out.println("===============");
		System.out.println(str.equals(str2));
		System.out.println(str3.equals(str4));
	}

	public void study1() {
		String name = "hello";
		// charAt이라는 메서드를 호출해보삼
		int i = 0;
		name.charAt(i);

		String name2 = "hello2";

		System.out.println("뭐나오나보자 " + name.charAt(i));
	}
}
