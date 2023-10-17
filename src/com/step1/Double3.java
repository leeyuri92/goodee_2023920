package com.step1;

public class Double3 {

	public static void main(String[] args) {
		int i = 1; 
		double d = 3.14; 
		i = (int)d ; // 강제형전환시에는 0.14는 int타입에 담을 수 없다.
		System.out.println(i); //3
		System.out.println(d); //3.14 
	}
}
