package com.jh.s2.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetStudy {

	public void study4() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);

		Iterator<Integer> it = hs.iterator();

		while (it.hasNext()) {
			// hasnext = 다음 요소 있냐? 있으면 true
			// 있으면 다음 요소 꺼내오라는거

			int num = it.next(); // .next() 다음 요소 주세요.
			System.out.println(num);
		}
	}

	public void study3() {
		System.out.println("lottery start");
		Random random = new Random();
		HashSet<Integer> lottery = new HashSet<>();
		boolean check = true;
		while (check) {
			lottery.add(random.nextInt(45) + 1);
			if (lottery.size() == 6) {
				check = false;
			}
		}

		System.out.println(lottery);
	}

	public void study2() {
		Random random = new Random();
		System.out.println("lottery start");
		// 로또 번호 1-45 6개 뽑고 list에 담아서

		ArrayList<Integer> lottery = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			int num = random.nextInt(45) + 1;
			lottery.add(num);
		}

		System.out.println(lottery);

	}

	public void Study1() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);

		System.out.println(hs);
		System.out.println(hs.size());
	}
}
