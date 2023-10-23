package com.week3;

public class Exception1 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);			
		} catch (Exception e) {
			System.out.println("어떤 값을 0으로 나눈값은 계산할 수 없습니다.");
		}
		System.out.println("필수처리해야하는 코드가 있다.");
	}

}
