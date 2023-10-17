package com.step5;

import java.util.ArrayList;

public class List3{
	void getFruitList(ArrayList<String> fruits) {
		for(int i = 0;i<fruits.size();i++) {
			System.out.println(fruits.get(i));		
		}
	}
	ArrayList<String> methodA(){
		ArrayList<String> fruits = new ArrayList();
		fruits.add("🍅");
		fruits.add(1,"❤️");
		fruits.add(1,"🍇");
		return fruits; // 지역변수는 다른곳에서 이용하려면 리턴타입을 사용한다.		
	}
	public static void main(String[] args) {		
		List3 li = new List3();
		ArrayList<String> fruits = li.methodA();
		System.out.println(fruits);
		System.out.println(li);
	}
}
