package com.jh.s2.util.collection;

import java.util.ArrayList;

public class ListStudy {

	public void study3() {
		// generic
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(9);
//		ar.add('b');
//		ar.add(3.12);
//		ar.add("bp");

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		int num = ar.get(0);
		// String name = (String) ar.get(3);
	}

	public void study2() {
		ArrayList ar = new ArrayList();
		int num = 1;
		ar.add(1);
		// add에 오브젝트 타입만 넣으라고 했는데 int 타입인 1이 왜들어가지?
		Integer n;
		// 이게 오브젝트 타입임. 모든 클래스의 부모는 옹브젝트니까. 원래는 얘가 들어가야 됨.
		// int num도 자동으로 autoboxing돼서 오브젝트 타입된거고.

		ar.add('a'); // 얘도 char타입이라 프리미티브 타입인데 오토박싱돼서 레퍼런스타입된거
		ar.add(3.42); // 얘도
		ar.add("hungry"); // 얘는 String 클래스임. 모든 클래스 부모는 오브젝트 타입임. 그래서 오토박싱 없이 그냥 바로 들어감. 다형성

		String k = "bp";
		Object obj = k;
		// 스트링 타입인k가 오브젝트 타입obj에 들어감. 우린 이걸 다형성이라고 부르기로 했어요.
	}

	public void study1() {
		int[] numbers = new int[2];

		ArrayList ar = new ArrayList(); // 기본 10칸 정도 만들어진다고 보면됨

		numbers[0] = 1;
		numbers[1] = 2;

		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.set(0, 2000);
		ar.remove(0);
		ar.clear();

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

	}
}
