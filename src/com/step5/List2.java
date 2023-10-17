package com.step5;

import java.util.ArrayList;

public class List2 {

	public static void main(String[] args) {
		ArrayList fruits = new ArrayList();
		fruits.add("🍅");
		fruits.add(1,"❤️");
		fruits.add(1,"🍇");
		String r1 = (String)fruits.remove(1);  // 괄호가 있으면 생성자냐 메소드냐
		System.out.println(fruits);
		System.out.println(r1);		

	}

}
