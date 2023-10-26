package bclass.step2;
// 
class A{
	
}
public class AMain {

	public static void main(String[] args) {
		A as[] = new A[3];   //객체배열
		// as[0],as[1],as[2] = null 을 3번 출력
		A a = new A();
		as[0] = a; // null - @주소 - 치환하기 - 참조형타입 치환 점검해보기
		for (A a1:as) {
			System.out.println(a1);
		}
	}
}
