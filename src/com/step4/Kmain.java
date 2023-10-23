package com.step4;
class K{
	K(Kmain km){
		System.out.println("K=====>" + km);
	}
}
public class Kmain {

	public static void main(String[] args) {
		Kmain km = new Kmain();
		System.out.println("Kmain===>" + km);
		km = new Kmain();
		K k = new K(km);
		

	}

}
