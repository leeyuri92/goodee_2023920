package com.step1;

public class Double4 {

	public static void main(String[] args) {
		int jumsu1 = 70;
		int jumsu2 = 85;
		int jumsu3 = 90;
		int total = jumsu1 +jumsu2 +jumsu3;
		double avg = (double)total/3;
		double d = 3.14; 
		// int + double = double
		// int - double = double
		// int * double = double
		// int / double = double
		System.out.println(avg);
		
		System.out.println(150.0/3); // 50.0
		System.out.println(151/3.0); // 50.333333333333336
		System.out.println(152/3); // 50
		// double타입이 하나라도 있으면 값도 double로 변환됨
		
		d=152/3; //50.0
		total = (int)(150.0/3); //50			
	}
}
