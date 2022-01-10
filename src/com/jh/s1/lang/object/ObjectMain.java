package com.jh.s1.lang.object;

public class ObjectMain {

	public static void main(String[] args) {
		// 메서드를 호출해보자.
		ObjectStudy1 os = new ObjectStudy1();
		// 생성자가 없으면 컴파일러가 기본생성자를 만들어준다.
		// 기본생성자=매개변수가 없는 생성자
		// 참조변수: 객체를 가르키는 주소를 담고있는 변수 = os

		os.study1();
		// 참조변수명.member();
		
		Car car = new Car();
		Object obj = car;
		obj = fc;
		
		boolean check = car.equals(fc);
		System.out.println(check);
	}

}
