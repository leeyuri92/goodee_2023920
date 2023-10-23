package com.step2;
class Param{
	int ival; // 전역변수, 전변은 초기화를 생략할 수 있다. 왜냐면 생성자가 대신 해준다.
}

public class TestParam {
	void effectParam(Param name) { // ()안에는 선언만 가능
		System.out.println("sub ival ==> " + name.ival);		
	}
	
	public static void main(String[] args) {
		Param p = new Param();  // new Param()과 p1이 같다
		p.ival = 500;
		
		Param p2 = new Param();
		p2.ival = 400;
		
		TestParam tp = new TestParam();
		tp.effectParam(p2);
		
		System.out.println("main ival ==> " + p.ival);
	}
}
/*
 TestParam.java 하나의 문서 안에 두개의 클래스가 존재
 TestParam.class와 Param.class가 존재
 Param.class에는 오직 ival변수 하나만 있다. - 디폴트 값은 0이다.
 main메소드는 TestParam에 있다. - 모든 클래스가 다 메인메소드를 가질 필요없다.
 단 실행할 수 있는 클래스는 오직 TestParam뿐이다.
 13번에서는 TestParam클래스 선언되지 않은 ival변수를 사용하였다.
 그러기 위해서는 반드시 인스턴스화를 해야만 한다.
 */
