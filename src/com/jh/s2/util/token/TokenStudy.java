package com.jh.s2.util.token;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		String str = "봄, 16, 여름,32, 가을,13, 겨울, -1";

		StringTokenizer st = new StringTokenizer(str, ",");

		ArrayList<SeasonDTO> ar = new ArrayList<>();

		while (st.hasMoreTokens()) {
			SeasonDTO sdto = new SeasonDTO();
			String token = st.nextToken();
			sdto.setName(token);// spring

			token = st.nextToken();
			sdto.setTemp(Integer.parseInt(token));

			ar.add(sdto);
			System.out.println(sdto.getName());
			System.out.println(sdto.getTemp());
		}
		for (int i = 0; i < ar.size(); i++) {
			SeasonDTO sdto =ar.get(i);
			System.out.println(sdto.getName());
			System.out.println(ar.get(i).getTemp());
		}
	}
}
