package com.step1;

public class Double2 {

	public static void main(String[] args) {
		int i = 1; 
		double d = 2; // 정수는 실수에 담을 수 있다.
		i = (int)d ; // 캐스팅 연산자 : 강제형전환		
		System.out.println(i); //2
		System.out.println(d); //2.0 
	}
}
