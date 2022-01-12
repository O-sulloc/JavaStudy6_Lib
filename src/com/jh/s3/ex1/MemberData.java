package com.jh.s3.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

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

	public ArrayList<MemberDTO> init() {
		// data에 있는 문자열을 StringTokenizer로 파싱해서
		// 멤버dto를 생성해서 멤버 변수 값으로 대입
		// 멤버dto들을 AL에 담아서 리턴해라
		StringTokenizer mdto = new StringTokenizer(data, "-");

		while (mdto.hasMoreTokens()) {
			MemberDTO mdto2 = new MemberDTO();
			String token = mdto2.nextToken();

		}
		return null;
	}

}
