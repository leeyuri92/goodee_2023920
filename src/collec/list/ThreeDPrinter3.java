package collec.list;
// 타입이 너무 포괄적이라 직관적이지가 않다. - 유지보수에 어렵다.
// 그래서 타입을 맞춰야 한다.
// 그래서 ClassCastingException이 발동될 수 있다. - 런타임오류
// 서버다운될 수 있음. 
public class ThreeDPrinter3 {
	private Object material;
	public Object getMaterial() {
		return material;
	}

	public void setMaterial(Object material) {
		this.material = material;
	}

}
