package com.step4;

public class Oper3 {

	public static void main(String[] args) {
		int i = 1;//i=1
		int j = i++;//j=1 -왜냐면 대입이 먼저 이니까 - 무조건 ++이 뒤에 있으면 나중에 증가시킴 - OCJP
		System.out.println(i);
		//i = i + j;//i+=j
		if((i > ++j)&(i++==j)) {//(2 >2=>false & (2==2==> 참)
			System.out.println("참일때");
		}else {
			System.out.println("거짓일때");			
		}
		System.out.println(i+", "+j);//15번에서는 3, 2
		i+=j;
		System.out.println(i+", "+j);//16번을 경유했으므로 3이5로 바뀐다, 2
	}

}
