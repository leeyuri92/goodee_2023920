package com.step4;
class J{
	int a;
	Jmain jm = new Jmain(this);
	J(){} // 디폴트생성자는 파라미터가 없으니까 생략해도 JVM이 제공해줌
}

public class Jmain {
	int b;
	J j = null;
	Jmain(){
		// 텅텅 빈 깡통이다 - 아무런 초기화도 하지않았다.
	}
	Jmain(J j){ // 생성자도 파라미터자리를 갖는다. 파라미터 자리에 참조형을 넘길 수 있다.
		this.j = j;
		this.b = 10;
	}
	void methodA() {
		// 파라미터로 넘어온 원본을 쓰고싶다. 어떡하지?
		// 원본이 뭘 의미하나요 - J가 Heap메모리 영역에 활성화 되었을 때 그 주소번지
		System.out.println(j);
	}
	public static void main(String[] args) {
		J j = new J();
		Jmain jm = new Jmain(j);
		jm = new Jmain(); // 생성자가 두번 호출되는데 자바에서는 메소드오버로딩컨벤션이라서 같은 이름이더라도 다른생성자로 인식함
		System.out.println(jm.b);	// 0 - 디폴트생성자호출되면 0출력, 파라미터를 가진 생성자 호출되면 10출력
		jm.methodA();
		

	}

}
