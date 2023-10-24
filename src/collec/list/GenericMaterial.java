package collec.list;
// 사용자 정의 제네릭 구현하기
public class GenericMaterial<T> {
	private T meterial;

	public T getMeterial() {
		return meterial;
	}

	public void setMeterial(T meterial) {
		this.meterial = meterial;
	}
}

/*
  자료형 매개변수 T<type parameter> : 이 클래스를 사용되는 시점에서 실제 사용할 자료형이 결정된다
  컴파일 타임에 JVM이 바꿔치기를 해준다.
  단, static 변수형은 사용 불가함 - 약속 - 컨벤션
  GenericMaterial은 제네릭의 자료형이다.
  T라는 대체문자를 사용하였다.
 */
