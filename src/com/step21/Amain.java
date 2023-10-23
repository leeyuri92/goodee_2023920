package com.step21;
class A{
	// 첫번째 학생 점수를 담을 변수 선언
	// 전변은 유지된다. - 
	// 미묘한 문제가 발생됨 - 재생성을 했다 - 복사본이 한 개 더 만들어졌다. 이전에 참조하던 클래스는 날아갔다.
	int n1 = 70;
	int n2 = 80;
	int n3 = 90;
	int tot = 0;
	void hap1() {
		int tot = n1 + n2 + n3; // tot는 지변이라서 다른 외부 클래스에서는 사용불가(재사용성이 떨어지는 코드)
		
		this.tot = tot;
	}
}
public class Amain {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.n1);	
		a.hap1();
		System.out.println(a.tot);	
	}
}

/*
  세 학생의 점수를 입력 받아서  -> 변수 3개 필요 -> 타입은 뭘로 할까? -> 전변인가 지변인가
  전변 - 초기화 생략가능, 하나의 클래스를 대표하는 값(인스턴스변수.변수명)
 */