package com.week3;
class Param{
	int ival;
}
public class TestParam {
	TestParam(){
		System.out.println("TestParam생성자 호출");
		//Param p = null;
		//effectParam(p);
	}
	//파라미터(생성자, 메소드) 자리에 참조형 타입 활용 연습
	void effectParam(Param p) {//p=null
		p = new Param();
		System.out.println("effectParam : "+p);//null
		p.ival = 100;
		System.out.println("sub ival : "+p.ival);//null
	}
	public static void main(String[] args) {
		TestParam tp = new TestParam();
		Param p = null;
		p = new Param();
		p.ival = 500;
		 tp.effectParam(p);
		 System.out.println("main ival : "+p.ival);//null
	}
}
