package bclass.board;

public class A {
	int i;                                                                 // 전역변수 선언하기 -  클래스 설계 1단계
	public A() {
		i=10;
	}
	public A(int i) {
		this(); //예약어로 호출 가능
	}
	public A(int a, int b) {}
	
	void methodA() {}
	// 해당 메소드 내에서만 유지됨 - 메소드 영역을 벗어나면유지되지 않음
	// 내부에서 처리된 결과가 한정적이다. - 인스턴스 변수에 대해서 한정됨
	// 만약 외부에서 유지되기를 원하면 전변으로 치환하던가 아니면 리턴타입을 활용함
	void methodA(int i) {           // 메소드 오버로딩 - 파라미터가 투입 - 지변 스택메모리거주
		A a = new A();
		
	}
	
	public static void main(String[] args) {
		A a = new A();
	}
	

}
