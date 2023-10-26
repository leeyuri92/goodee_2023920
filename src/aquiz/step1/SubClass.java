package aquiz.step1;
// private < friendly < protected < public
class BaseClass {
	private float x = 1.0f;

	protected float getVar() {
		return x;
	}
}
class SubClass extends BaseClass {
	private float x = 2.0f;
//insert code here
	
	//float getVar() { return x; }
	public float getVar() { return x; }
	//public double getVar() { return x; }
	protected float getVar() { return x; }
	//public float getVar(float f) { return f; }

}