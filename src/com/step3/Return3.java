package com.step3;

public class Return3 {
	String m(int i) {
		String hint = null;
		if(i<0) {
			hint = "너 음수래";
			return hint;					
		}else if(i>0) {
			hint = "너 양수래";
			return hint;
		}else {
			return "";         
		}		
	}
	public static void main(String[] args) {
		Return3 rr = new Return3();
		rr.m(4);
		System.out.println(rr.m(4));
		

	}

}
