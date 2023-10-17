package com.week3;

public class ThreeOper {

	public static void main(String[] args) {
		System.out.println(10+10);//20
		System.out.println("10"+10);//1010
		System.out.println("10"+(10+20));//1030
		int hour = 7;
		String result = (hour < 10 ? "0"+hour:""+hour);
		System.out.println(result);
	}

}
