package com.step4;

public class UnitTest {

	public static void main(String[] args) {
		BaseBallGame bbg = new BaseBallGame();
		String hint = null;
		int cnt = 0;
		
		for(int i = 0 ; i<3 ; i++) {
			hint = bbg.account(++cnt + "회차: "+"25"+ ++i);
			System.out.println(hint);
		}

	}
	// System.out.println(bbg.com[0]+" "+bbg.com[1]+" "+bbg.com[2]);			

}
