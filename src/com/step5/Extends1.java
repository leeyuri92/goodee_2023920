package com.step5;
class Super{
	int i;
	Super(){
		System.out.println("Super() 호출");
		System.out.println(i);
	}
	void methodA() {
		System.out.println("methodA() 호출");		
	}
	void methodA(int i) {
		System.out.println("Super methodA(int i) 호출");
	}
}
class Sub extends Super{
	Sub(){
		System.out.println("Sub() 호출");
		i=2;
		System.out.println(i);		
	}
	@Override
	void methodA(int i) {
		System.out.println("Sub methodA(int i) 호출");		
	}
}

public class Extends1 {

	public static void main(String[] args) {
		Sub sub = new Sub();
		System.out.println(sub.i);
		sub.methodA(0);   //  Sub methodA(int i) 호출
	}
}
