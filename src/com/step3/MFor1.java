package com.step3;
public class MFor1 {
	public static void main(String[] args) {
		//for문 안에 if문이 꼭 와야하나?
		int i;//하나 둘, 셋 센다
		int hap = 0;
		for(i=1;i<4;i=i+1) {
			hap = hap + i;
			System.out.println("i= "+i);
			System.out.println("hap= "+hap);
			//if() {}
		}
		hap = 0;
		for(i=1;i<6;i=i+1) {
			hap = hap + i;
			System.out.println("i= "+i);
			System.out.println("hap= "+hap);
			//if() {}
		}
		//System.out.println(hap);
	}
}