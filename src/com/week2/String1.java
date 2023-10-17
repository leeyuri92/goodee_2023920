package com.week2;

public class String1 {

	public static void main(String[] args) {
		String s1 = "안녕"; //  string은 new를 사용하지않아도 새로운 클래스를 만들 수 있음
		String s2 = "안녕"; // s1과 같은 곳을 가리킴 = 같은 주소
		String s3 = new String("안녕"); // 새로운 클래스 생성 = 다른 주소
		String s4 = new String("안녕"); // 새로운 클래스 생성 = 또 다른 주소		
			
		System.out.println(s1==s2);  // T
		System.out.println(s1==s3);  // F
		System.out.println(s1.equals(s3));  // T
		System.out.println(s1==s4); // F
		System.out.println(s1.equals(s4));  // T
	}
}
