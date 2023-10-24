package collec.list;
// 제네릭을 사용한다는건 주소번지를 두번 접근해야 값에 도달함
// 데이터셋 역할을 하는 클래스 설계에 대한 이해가 필요하다.
// Spring Boot - DB연동을 직접 하지 않는다. (DML을 사용하지 않는다.) - 그런데 DB연동은 된다.
// 자동(추상적이다 - 쿼리문이 안보임)으로 해준다 - Hibernate - 데이터베이스의 테이블 관계를 클래스 설계로 처리하기 때문에
// 쿼리문이 없어도 DB연동이 가능하다.
// List<Object> -> List<Element> -> List<T> type parameter -> 개발자 자유도를 높인다.
public class ThreeDPrinter2 {
	private Plastic material;

	public Plastic getMaterial() {
		return material;
	}

	public void setMaterial(Plastic material) {
		this.material = material;
	}

}
