package com.jh.s2.util.collection;

import java.util.HashMap;

public class MapStudy {

	public void study1() {
		// HashMap
		HashMap<String, Integer> map = new HashMap<>();

		// put
		map.put("f1", 1);
		map.put("f2", 2);
		map.put("f3", 1);

		Integer num = map.get("f2");
//		System.out.println(num);

		map.remove("f3");
	//	System.out.println(map);

		map.put("f1", 3000432);

		String name = "jh";
		map.put(name, null);
		
		// map.clear();
		//System.out.println(map);

		// 없는 키로 꺼내면 null이 나온다.
		Integer n = map.get("test");
		//System.out.println(n);
	}
}
