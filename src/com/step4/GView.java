package com.step4;
class GLogic{
	int i = 1;
	GLogic(GView gv){   //gv = null
		System.out.println("GLogic : "+gv);
		System.out.println("GLogic i :" + gv.j);
	}
}
public class GView {
	int j=1;
	GView(){
	// 디폴트 생서자만 생략가능함
	GLogic gl =new GLogic(this);  // this는 현재 스레드관리하는 클래스이고 원본
	}
	public static void main(String[] args) {
		// static안에서는 this나 super사용불가 - 생성자에서는 가능함
		GView gv = new GView();
		gv = new GView();
		gv.j=10;
		
		System.out.println(gv);
	}
}
