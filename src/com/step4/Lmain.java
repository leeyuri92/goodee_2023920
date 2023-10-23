package com.step4;
//인스턴스화가 A a = new A();
//역할은? a.전변호출한다. a.사용자정의메소드 호출한다.
class L{
	int i = 1;//전역변수선언-외부클래스에서 접근이 가능하다-단 인스턴스화해야 함
}
public class Lmain {
	void methodA(L l) {//메소드 구현은 좌중괄호 우중괄호로 끝남
		System.out.println("호출 성공 "+l);
		int j = l.i;//대입연산자- 오른쪽에 값을 왼쪽에 대입하시오.
		System.out.println(j);
	}//end of methodA()
	//14-19(인스턴스화)-20-21-8(메소드호출)-9-10(재정의,초기화,치환,지변이다)-11
	public static void main(String[] args) {
		//Lmain클래스에서 L클래스에 정의된  전변 i를 사용하고 싶다면??
		//Lmain안에서 L클래스가 인스턴스화 되어야 한다.(제어권을 Spring갖음<--spring 대신 인스턴스화해주는것<--객체라이프사이클관리해줌  )
		//인스턴스화에 여러 방법 꼭 체크해본다. - 새로운 시야
		//어떤 클래스명으로 인스턴스화를 진행할건가요?
		L l = new L();//지변의 성격이다.
		Lmain lm = new Lmain();
		lm.methodA(l);//메소드 호출은  세미콜론
	}

}
