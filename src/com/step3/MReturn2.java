package com.step3;
class People{
	String name = "나신입";
	public String getName() {
		//name = "나초보";
		return name;
	}
	public People getPeople() {
		return new People();
	}
}
public class MReturn2 {
	
	public static void main(String[] args) {
		People p = new People();
		System.out.println(p.name);
		System.out.println(p.getName());
		System.out.println(p);//
		System.out.println(p.getPeople());//
	}

}
