package com.step4;

class A{  // 변수만
	int age = 0;
}
class A1{  // 메소드만	
	void methodA() {
		A a = new A();
		a.age = a.age + 1; 
	}
}
public class Amain {
	public static void main(String[] args) {
		A a = new A();
		A1 a1 = new A1();
		//a1.methodA();
		System.out.println(a.age);
		}
}
