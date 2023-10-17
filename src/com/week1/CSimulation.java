package com.week1;
class C{
	int i = 1;
}//end of C
public class CSimulation {
	void methodA(C c) {
		System.out.println("methodA ===> " + c.i);
	}
	public static void main(String[] args) {
		//6번을 호출하기 위해서 인스턴스화 했어요
		CSimulation cs = new CSimulation();
		//methodA()를 호출할 때 파라미터로 C클래스의 인스턴스를 넘기기 위해 인스턴스화함
		C c = new C();
		cs.methodA(c);//메소드 호출시 파라미터 자리에 13번에서 생성한 변수를 넘김
		System.out.println("main ===> " + c.i);//C클래스에 선언한 전변i를 호출함
	}//end of main
}////end of CSimulation
