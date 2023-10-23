package com.step1;

class A{
	int i = 1;
}
public class ASimulation {

	public static void main(String[] args) {
		A a = new A();
		// 내 안에서 A클래스에 정의된 전역변수를 호출하기
		int j = 0;
		j = a.i; // 치환
		System.out.println(a.i); // a = 인스턴스변수
		System.out.println(j); // j = 지역변수
	}
}
/* 
 ASimulation.java
 A.class, ASimulation.class 
 */

