package com.step4;

class B{  // 변수만
	int age = 0;
}
class B1{  // 메소드만	
	void methodA(B a) {
		a.age = a.age + 1; 
	}
}
public class Bmain {
	public static void main(String[] args) {
		B a = new B();
		B1 a1 = new B1();
		a1.methodA(a);
		System.out.println(a.age);
	}
}
