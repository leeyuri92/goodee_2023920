package com.step5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>(); // object 객체형식의 모든것을 다 포함
		map.put("deptno","10");
		map.put("dname","영업부");
		map.put("loc","부산");
		Set<String> set = map.keySet();
		Object keys[] = set.toArray();
		
		System.out.println(keys[0]);
		System.out.println(keys[1]);
		System.out.println(keys[2]);
		
		for(int i = 0;i<keys.length;i++) {
			System.out.println(keys[i] +" ==> " + map.get(keys[i]));
		}
	}
}
