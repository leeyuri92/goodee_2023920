package com.week3;
class A{
	JFrame2 jf = null;
	public A(JFrame2 jFrame2) {
		System.out.println("A(this)호출");
		this.jf = jFrame2;
		System.out.println(this.jf);
		System.out.println("jf.i : "+jFrame2.i+", this.jf.i:"+this.jf.i);//1을 쥐고 있다|없다
	}
}
class B{
	
}
public class JFrame2 {
	int i = 1;
	//전변위치
	//A a = new A(this);
	JFrame2(){
		A a = new A(this);
	}
	//main스레드이다- entry point
	public static void main(String[] args) {
		System.out.println("main호출");
		//insert here
		JFrame2 jf = new JFrame2();
		System.out.println(jf.i);//1
		System.out.println(jf);
	}

}
