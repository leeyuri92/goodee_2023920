package com.step21;
class C{
	int n1 = 70;
	int n2 = 80;
	int n3 = 90;
}
// C1클래스 = C클래서에서 전달 받은 데이터를 가지고 총합을 구하는 메소드 선언
// 같은 이름의 메소드를 2개 정의 -> 메소드오버로딩 - 파라미터 갯수 or 타입이 다름
class C1{
	int hap1() {	
		C c = new C(); // 학생수가 10명이라면 인스턴스화를 10번 반복해야 함 - 반복문의 필요성
		int hap = c.n1 + c.n2 + c.n3;
		return hap;
	}
	int hap1(C c ) {
		int hap = c.n1 + c.n2 + c.n3;
		return hap;
	}	
}
public class Cmain {
	public static void main(String[] args) {
		C c = new C();
		C1 a = new C1();
		int hap = a.hap1();
		System.out.println(hap);
		c.n1 = 50;
		c.n2 = 60;
		c.n3 = 50;
		hap = a.hap1(c);
		System.out.println(hap);
	}

}
