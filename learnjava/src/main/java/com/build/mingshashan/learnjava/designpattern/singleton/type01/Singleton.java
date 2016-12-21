package com.build.mingshashan.learnjava.designpattern.singleton.type01;

public class Singleton {
	private static Singleton instance = null;

	private Singleton() {
		// TODO Auto-generated constructor stub
	}

	public static Singleton getInstance() {
		if (null == instance) {
			instance = new Singleton();
		}

		return instance;
	}

	public void test() {
		System.out.println("type01 singleton test");
	}
}
