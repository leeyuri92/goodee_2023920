package com.step5;
//모든 클래스는 상위 클래스인 Object를 상속받고 있다. 생략된것이다.
public class K extends Object {
	/*
	 * @Override public String toString() { return "K"; }
	 */
	public static void main(String[] args) {
		K k = new K();
		//k를 호출하는 것과 k.toString()호출하는 것은 결과가 같다
		System.out.println(k);
		System.out.println(k.toString());

	}

}
