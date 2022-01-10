package com.jh.s1.lang.object;

public class ObjectStudy1 {

	public void study1() {
		System.out.println("Study1 Start");
		// lang.Object 객체 생성하고 주소출력해보삼

		Object obj = new Object();
		System.out.println(obj);

		int num = obj.hashCode();
		System.out.println(num);

		String s = obj.toString();
		System.out.println(s);
		
	}
}
