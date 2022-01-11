package com.jh.s1.lang.string.ex1;

public class MemberData {

	private String data;

	// 기본 생성자 선언해보기
	// 생성자는 리턴타입없고, 이름도 클래스명이랑 동일하게해야함.
	public MemberData() {
		this.data = "id1-pw1-name1-id1@gmail.com-42-";
		this.data = this.data + "id2 - pw2 - name2 - name2@naver.com-53-";
		this.data = this.data + "id3 - pw3 - name3 - name3@daum.net-45-";
		System.out.println(this.data);

	}

	public MemberDTO[] init() {
		String[] datas = data.split("-");
		

		MemberDTO[] members = new MemberDTO[3];

		int index = 0;

		for (int i = 0; i < 3; i++) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(datas[index]);
			memberDTO.setPw(datas[++index]);
			memberDTO.setName(datas[++index]);
			memberDTO.setEmail(datas[++index]);
			memberDTO.setAge(datas[++index].);
			members[i] = memberDTO;
			index++;
		}
		return members;
	}

}
