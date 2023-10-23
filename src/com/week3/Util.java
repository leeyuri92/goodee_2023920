package com.week3;

public class Util {
	Util  util = null;
	public Util getInstance() {
		if(util == null) {
			util = new Util();
		}
		return util;
	}
	public static void main(String[] args) {
		Util util = new Util();
		System.out.println(util);
		System.out.println(util.getInstance());
	}

}
