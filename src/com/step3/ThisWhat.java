// this

package com.step3;
public class ThisWhat {
	int aaa = 0;
	public void tw() {
		int aaa = 10;
		this.aaa = aaa;
	}
	public static void main(String[] args) {
		ThisWhat t = new ThisWhat();
		t.tw();
		System.out.println(t.aaa);    // 10
	}
} 
