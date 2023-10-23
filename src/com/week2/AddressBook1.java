package com.week2;
// 인스턴스화하는 여러가지 방법
public class AddressBook1 {
	AddressBook1 abook = null;
	// 1) 메소드 안에서 조건에 따라 인스턴스화를 다르게 가져갈 수도 있다
	// spring프레임워크 - 의존성주입, 제어역행
	public AddressBook1 getObject() {
		// 이와 같이 null 유무를 체크해서 생성하는 건 하나만 관리하겟다 - 싱글톤
		if(abook == null) { // 객체를 생성하기전에 null체크를 먼저(선처리) 하겠다.
			abook = new AddressBook1();
		}
		return abook;
	}
	public static void main(String[] args) {
		AddressBook1 abook = new AddressBook1();  // 기본
	}
}
