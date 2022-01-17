package com.jh.s3.ex1.member;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberData {

	private String data;
	private Scanner sc;

	// 기본 생성자 선언해보기
	// 생성자는 리턴타입없고, 이름도 클래스명이랑 동일하게해야함.
	public MemberData() {
		this.sc = new Scanner(System.in);
		this.data = "id1-pw1-name1-id1@gmail.com-42-";
		this.data = this.data + "id2 - pw2 - name2 - name2@naver.com-53-";
		this.data = this.data + "id3 - pw3 - name3 - name3@daum.net-45-";
		this.data = this.data + "id4 - pw4 - name4 - name4@daum.net-12-";
	//	System.out.println(this.data);

	}

	public MemberDTO removeMember(ArrayList<MemberDTO> ar) {
		MemberDTO mdto = new MemberDTO();
		System.out.println("삭제할 아이디를 입력하세요.");
		String id = sc.next();

		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i).getId().equals(id)) {
				mdto = ar.remove(i);

				break;
			} else {
				System.out.println("일치하는 아이디가 없습니다.");
			}

		}

		return mdto;
	}

	public void addMember(ArrayList<MemberDTO> ar) {
		MemberDTO mdto = new MemberDTO();
		System.out.println("아이디를 입력하세요.");
		mdto.setId(sc.next());
		System.out.println("비밀번호를 입력하세요.");
		mdto.setPw(sc.next());
		System.out.println("이름을 입력하세요.");
		mdto.setName(sc.next());
		System.out.println("이메일을 입력하세요.");
		mdto.setEmail(sc.next());
		System.out.println("나이를 입력하세요.");
		mdto.setAge(sc.nextInt());

		ar.add(mdto);

	}

	public ArrayList<MemberDTO> init() {
		// data에 있는 문자열을 StringTokenizer로 파싱해서
		// 멤버dto를 생성해서 멤버 변수 값으로 대입
		// 멤버dto들을 AL에 담아서 리턴해라
		StringTokenizer st = new StringTokenizer(this.data, "-");
		ArrayList<MemberDTO> ar = new ArrayList<>();

		while (st.hasMoreTokens()) {
			MemberDTO mdto = new MemberDTO();
			mdto.setId(st.nextToken().trim());
			mdto.setPw(st.nextToken().trim());
			mdto.setName(st.nextToken().trim());
			mdto.setEmail(st.nextToken().trim());
			mdto.setAge(Integer.parseInt(st.nextToken().trim()));

			ar.add(mdto);
		}

		return ar;
	}

}
