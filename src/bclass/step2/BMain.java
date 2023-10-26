package bclass.step2;
class B{
	// 생성자의 접근제한자를 private으로 하여 제약을 건다.
	// 같은 클래스 안에서는 소환가능, 외부에서는 불가
	
	int i = 1;
	static B b = new B(); // 전변의 자리, 인스턴스화를 하여 접근가능. - 이른 인스턴스화
	private B() {
		
	}
	// 인스턴스변수를 사용할 수 없으니(왜냐면 생성자앞에 private) 메소드 선언시 static을 붙인다.
	// 클래스변수.createB()를 호출한다.
	// 선언부에 전변의 이름앞에도 static을 붙여서 return변수 b에 컴파일 에러를 해결하였다. 
	public static B createB() {
		return b;
	}
}
public class BMain {
	int i = 1;

	public static void main(String[] args) {
		B bs[] = new B[3];
		B b = B.createB();
		System.out.println(b.i++);
		bs[0] = b;
		b = B.createB();
		System.out.println(b.i++);
		bs[1] = b;
		b = B.createB();
		System.out.println(b.i++);
		bs[2] = b;
		for(B b1:bs) {
			System.out.println(b1);
		}
	}
}
