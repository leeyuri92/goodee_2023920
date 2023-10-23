package com.step3;
public class MFor2 {
	public static void main(String[] args) {
		//for문 안에 if문이 꼭 와야하나?
		int i;//하나 둘, 셋 센다
		int hap = 0;
		for(i=1;i<=5;i=i+1) {
			hap = hap + i;
			System.out.println("i= "+i);
			System.out.println("hap= "+hap);
			if(i%2==0) {
				System.out.println(i+"짝수입니다.");
			}else{
				System.out.println(i+"홀수입니다.");
			}
		}
		//System.out.println(hap);
	}
}