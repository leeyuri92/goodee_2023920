package com.step5;

import java.util.Iterator;

public class Array21 {

	public static void main(String[] args) {
		int is[][] = new int[2][3];    // 선언
		
		is = new int[][] {{1,2,3},{4,5,6}};    //  초기화
		int is2[][] = {{1,2,3},{4,5,6}};         //  초기화 (JSON 포멧 - web개발)
		
		System.out.println(is.length);      // 2
		System.out.println(is[0].length);  // 3  -  컬럼명과 변수명 통일함
		System.out.println(is[1].length);  // 3
		
		for(int x=0 ; x<is.length ; x++) {  // x 는 로우값이다 0, 1
			for(int y=0; y<is[x].length; y++){
				System.out.println("is["+ x +"][" +y+"]=" + is[x][y]);
			}			
		}
		is[0] = new int[3];
		is[1] = new int[3];
	}
}
