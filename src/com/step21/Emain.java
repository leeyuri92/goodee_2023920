package com.step21;

import java.util.Scanner;

class E{
	Scanner sc = new Scanner(System.in);
	// getFirst메소드를 선언해서 사용자로 부터 숫자를 입력받는 메소드를 구현해보자.
	public int getFrist() {
		int num=0;
		num = sc.nextInt();
		return num;	
	}
	public int getSecond() {
		int num=0;
		num = sc.nextInt();
		return num;	
	}
	public int add(int first, int second) {
		return first + second;
	}
	public int minus (int first, int second) {
		return first - second;
	}
	public int multi (int first, int second) {
		return first * second;
	}
	public double divid(int first, int second) {
		return first / (double)second;
	}
}
public class Emain {
	// Random r = new Random();
	// int dap = r.nextInt(10);  -  0.0 ~10.0인데 0.0은 포함하고 10.0은 포함하지 않는 그 사이의 정수값 채번됨

	public static void main(String[] args) {
		E e = new E();
		System.out.println("첫번째 숫자를 입력하세요");
		int first = e.getFrist();
		System.out.println("첫번째 입력받은 숫자는 " +first+"입니다");		
	
		System.out.println("두번째 숫자를 입력하세요");
		int second = e.getSecond();
		System.out.println("두번째 입력받은 숫자는 " +second+"입니다");
		System.out.println("입력받은 두 수의 합은 " +e.add(first, second)+"입니다");		
		System.out.println("입력받은 두 수의 차는 " +e.minus(first, second)+"입니다");		
		System.out.println("입력받은 두 수의 곱은 " +e.multi(first, second)+"입니다");		
		System.out.println("입력받은 두 수의 나눗셈 값은 " +e.divid(first, second)+"입니다");		
	}
}

