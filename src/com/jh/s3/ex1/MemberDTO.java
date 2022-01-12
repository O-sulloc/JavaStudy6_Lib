package com.jh.s3.ex1;

public class MemberDTO {
	// 멤버변수의 접근지정자는 private으로 선언하삼
	// 외부에서 접근가능하도록 뭔가를 만들어야 함 <- 바로.. getter setter다

	private String id;
	private String pw;
	private String name;
	private String email;
	private int age;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
