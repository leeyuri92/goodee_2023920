package com.week3;

public class CalcLogic {
	CalcView2 calcView2 = null;//유지, 동기화
	public CalcLogic(CalcView2 calcView2) {
		System.out.println(calcView2);//객체 주입(원본이다-현재 메모리에 로딩중인)
		this.calcView2 = calcView2;
	}

}
