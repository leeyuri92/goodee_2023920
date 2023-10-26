package bclass.step2;
class C {
	CMain cm = null;
	public C(CMain cMain) {  // 리턴타입이 없지만 setter꼴처럼 재정의 통해서 원본을 유지함
		System.out.println(cm);        // null
		this.cm = cMain;                // 치환
		System.out.println(cm);        // 주소번지
		System.out.println(cm==cMain);        // true  증명끝
	}
}
public class CMain {
	C c = new C(this);
	public static void main(String[] args) {
		CMain cm = new CMain();
		System.out.println("before : "+cm);        // 주소번지
		cm = new CMain();
		System.out.println("after : "+cm);        // 주소번지
	}  
}
