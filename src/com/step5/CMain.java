package com.step5;
class C{
	int i;
	C getInstance() { // Calendar cal = Calendar.getInstance(); - 싱글톤패턴
		return new C();
	}
}

public class CMain {

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.i);
		c.i = 10;
		System.out.println(c.getInstance().i); //0

	}

}
