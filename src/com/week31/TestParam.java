package com.week31;
class Param{
	int ival;
}
public class TestParam {
	TestParam(){
		System.out.println("디폴트 생성자 호출");
		//Param p = null;
		//effectParam(p);
	}
	void effectParam(Param p) {//p=null
		System.out.println(p);//null
	}
	//16-17-6
	
	public static void main(String[] args) {
		TestParam tp = null;//선언만 했다 - 타입만 결정됨 - 그래서 생성자 호출이 안된다.
		System.out.println(tp);
		tp = new TestParam();
		System.out.println(tp);
		Param p = new Param();
		tp.effectParam(p);
	}

}
