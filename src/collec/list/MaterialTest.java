package collec.list;

public class MaterialTest {

	public static void main(String[] args) {
		Plastic p = new Plastic();
		// toString() 재정의 되지 않으면 주소번지가 출력되는데
		// 지금은 재정의 되었으므로 주소번지가 출력되지 않는다.
		// UI솔루션을 사용하여 자바와 연동시에 인터페이스 되는 부분들을 
		// toString() 재정의해서 사용할 수 있다. - 공통코드 => 공통팀(백엔드로 국한되지 않음 - 프론트도 포함됨)
		System.out.println(p);
		System.out.println(p.toString());

	}

}
