package com.jh.s3.ex1.student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.jh.s3.ex1.member.MemberDTO;
import com.jh.s3.ex1.member.MemberData;

public class StudentData {
	private Scanner sc;

	public StudentData() {
		sc = new Scanner(System.in);
	}

	public Map<String, StudentDTO> addStudent(List<MemberDTO> ar) {
		// member 회원수만큼 키보드로부터 국영수성적 정보 입력받기. 총점평균은 자동계산
		// 이 정보들을 StudentDTO에 넣어야함. 그럼 객체 만들어야 딤
		// map의 key는 id

		HashMap<String, StudentDTO> map = new HashMap<>();
		for (int i = 0; i < ar.size(); i++) {
			StudentDTO studentDTO = new StudentDTO();

			studentDTO.setId(ar.get(i).getId());
			studentDTO.setName(ar.get(i).getName());
			System.out.println("국어 입력");
			studentDTO.setKor(sc.nextInt());
			System.out.println("영어 입력");
			studentDTO.setEng(sc.nextInt());
			System.out.println("수학 입력");
			studentDTO.setMath(sc.nextInt());
			studentDTO.setTotal(studentDTO.getKor() + studentDTO.getEng() + studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal() / 3.0);

			map.put(studentDTO.getId(), studentDTO);
		}
		return map;
	}
}
