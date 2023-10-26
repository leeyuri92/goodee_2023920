package aquiz.step1;

class A {
	public byte getNumber() {
		return 1;
		}
	}
class B extends A {
	@Override
	public byte getNumber() {
		return 2;
		}
	public static void main(String args[]) {
		B b = new B();
		System.out.println(b.getNumber());
		}
	}

