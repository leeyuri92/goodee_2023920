package com.step4;
//메소드오버로딩은 같은 이름의 메소드나 생성자를 중복해서 선언할 수 있다.
//단 이름은 같지만 반드시 파라미터의 갯수나 타입은 달라야 한다.
class F{
	F(){}
	F(int i){}
	F(int i, int j){
		System.out.println(i + "," + j);
	}
	F(boolean isOK){System.out.println();}
	F(String s, int i){}
}
public class Fmain {
	public static void main(String[] args) {
		F f = new F(1,2);  // 1,2
		System.out.println(f);
		f = new F(true);  // 객체배열,  자료구조, Web or hybride - JSON
		System.out.println(f);  // 다른 주소번지를 가질 것이다. - 예측
	}
}
