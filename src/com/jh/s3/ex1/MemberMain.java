package com.jh.s3.ex1;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {
		MemberData md = new MemberData();
		ArrayList<MemberDTO> members = md.init();

		for (int i = 0; i < members.length; i++) {
			System.out.println(members[i].getId());
			System.out.println(members[i].getPw());
			System.out.println(members[i].getName());
			System.out.println(members[i].getEmail());
			System.out.println("=======================");
		}
	}

}
