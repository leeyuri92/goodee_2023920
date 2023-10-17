package com.step4;

public class Array1 {

	public static void main(String[] args) {
		int com[] = new int[3];
		System.out.println(com);
		for(int i=0;i<3;i++) {
			System.out.println("com["+i+"] = "+com[i]);
		}
		int my[] = {1,2,3};
		//가진 전부를 처리할 땐 개선된 for문 사용함
		for(int i:my) {
			System.out.print(i);//1 2 3
		}
		System.out.println();
		int other[] = new int[] {1,2,3};
		for(int i:other) {
			System.out.println(i);//1 2 3
		}		

	}

}
