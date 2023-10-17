package com.step1;

class A1{
	int i = 1;
}
public class ASimulation1 {

	public static void main(String[] args) {
		A1 a = new A1();
		a.i = 2;
		int j = 0;
		j = a.i; 
		System.out.println(a.i); // a = 인스턴스변수
		System.out.println(j); // j = 지역변수
	}
}

