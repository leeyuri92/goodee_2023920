package com.step1;
/*
 * 지역변수를 선언할 수 있는 위치는 메소드 안에서 하거나 파라미터 자리에 할 수 있다.
 * 파라미터 자리란 메소드 괄호안을 말함
 * 그 괄호 안에서는 오직 선언만 가능함(초기화는 불가함)
 * 파라미터자리는 사용자가 입력한 값을 가져오는 자리이다.
 * 그러면 파라미터 자리에 선언된 변수는 지역변수라고 하였다.
 * 초기화는 반드시 해야한다면서 언제 초기화가 되는 걸까요? = 메소드를 호출할 때 값이 결정된다.
 */

public class Variable3 {
	// 사용자 즉 개발자가 임의의 메소드를 얼마든지 선언할 수 있고 구현할 수 있다.
	public void account(int i, int j) { // 파라미터 자리에 선언된 변수는 지역변수이다.
		System.out.println("account 호출 성공");
		System.out.println(i); // 1 - call by value : 호출할 때 값이 복사된다(초기화된다)
		System.out.println(j);
		
	}
	// 컴파일을 하는 언어는 컴파일 타임에 문법체크함
	public static void main(String[] args) {
		// insert here - 내가 정의한 메소드 account 호출하기
		// 내 안에 정의돈 메소드라 하더라도 static 영역에서 static이 없는 메소드를 호출하려면
		// 반드시 인스턴스화를 할 것
		// 주소번지or인스턴스변수(해당메소드가 선언된 소유주).account(1,2);
		Variable3 b = new Variable3();
		b.account(1,2); // 초기화 되는 곳
		// b.account(5); // 파라미터의 갯수가 다르면 같은 이름의 메소드라 하더라도 다른 메소드로 인지함(JVM)		
	
	}

}
