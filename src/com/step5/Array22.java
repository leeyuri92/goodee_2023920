package com.step5;

public class Array22 {

	public static void main(String[] args) {
		String datas[][] = {
				{"나신입","70","80","90"}
				,{"나초보","60","70","80"}
				,{"나일등","80","90","90"}				
		};
		for (int x=0; x<datas.length;x++) {
			for(int y=0 ; y<datas[x].length ; y++){
				System.out.println("datas["+ x +"][" +y+"] = " + datas[x][y]);
			}		
		}
	}
}
