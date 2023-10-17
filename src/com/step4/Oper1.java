package com.step4;

public class Oper1 {

	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		//이거나 비교 일때는 첫번째 조건이 참이면 두번째 조건은 따질 필요가 없다. -왜냐면 어차피 실행될거니까
		//첫번째 조건만 따지고도 실행문이 결정된다.
		//예) 아이디 중복검사 -
		if((++i>j)&&(i<j--)) {//(2>=2  or 2<2
			System.out.println("참");			
		}else {
			System.out.println("거짓");
		}
		System.out.println(i+", "+j);//i=2, j=2
	}

}
/*
True & True -> True &엔퍼센트 연산자
True & False -> False
False & True -> False
False & False -> False

&& 두 개이면 &일때 똑같은데
처음 조건이 False이면 뒤에 조건이 참이어도 어차피 실행문이 실행되지 않음
이러한 이유로 &&두개를 사용한다 - 일량을 줄여준다.
한개 이든 두개이든 결과에는 영향이 전혀 없다

True & True -> True | 파이프 연산자
True & False -> True
False & True -> True
False & False -> False
*/







