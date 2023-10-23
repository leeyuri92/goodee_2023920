package com.step4;
class M{
	int tot;//총점 담기
	double avg;//평균 담기
}
class M1{
	void hap() {
		System.out.println("hap()");
	}
	void hap(int n1) {
		int n2=2;
		System.out.println("hap(int)"+n1);		
		System.out.println("hap(int)"+n2);		
	}
	void hap(M1 m1) {//목적지이다
		System.out.println("hap(M1) ===>"+m1);		
	}
}
public class Mmain {

	public static void main(String[] args) {
		int n1 = 70;
		int n2 = 80;
		int n3 = 90;
		M1 m1 = null;
		System.out.println(m1);//null출력
		//여기서 호출하면 NullPointerException
		//insert here - 공백 - 시점(위치)의 문제 발생
		m1 = new M1();
		System.out.println(m1);//null출력
		m1.hap(m1);
		//지변 이더라도 파라미터를 통해서 원본을 넘기면 다른 메소드에서도 사용이 가능하다
	}

}
