package com.step1;
/*
 * 지역변수를 선언할 수 있는 위치는 메소드 안에서 하거나 파라미터 자리에 할 수 있다.
 * 파라미터 자리란 메소드 괄호안을 말함
 * 그 괄호 안에서는 오직 선언만 가능함(초기화는 불가함)
 * 파라미터자리는 사용자가 입력한 값을 가져오는 자리이다.
 * 그러면 파라미터 자리에 선언된 변수는 지역변수라고 하였다.
 * 초기화는 반드시 해야한다면서 언제 초기화가 되는 걸까요? = 메소드를 호출할 때 값이 결정된다.
 */

public class Variable1 { //extends Object는 상속되어있다, 없어도 됨
	// 변수를 선언 할 수 있다.
	// 접근제한자 타입 변수이름 = 
	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		System.out.println(i+j);
		// 두 수의 합을 담을 변수를 선언함
		// 만일 합한 결과값을 다른 메소드에서 재사용하고 싶다면 변수선언하자
		int hap = i+j; 
		System.out.println(hap);		
	}
}
