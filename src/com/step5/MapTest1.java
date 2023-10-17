package com.step5;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {

	public static void main(String[] args) {
		// 선언부와 생성부의 타입을 다르게 인스턴스화 하기 - 다형성
		// 선언부(추상클래스, 인터페이스, 구현체클래스) - 고급, 세련됨
		// Hashtable(멀티스레드안전), HAshMap(싱글안전)
		// List보다 속도빠름 - milisec - 순서가 없다
		Map<String, String> map = new HashMap<>(); // object 객체형식의 모든것을 다 포함
		map.put("deptno","10");
		map.put("dname","영업부");
		map.put("loc","부산");
		System.out.println(map.get(10));
		System.out.println(map.containsKey(10));
		System.out.println(map.containsKey("deptno"));
		if(map.containsKey(10)) {
			System.out.println("키가 있어요");
		}else {
		System.out.println("키가 없어요");
		}
	}

}
