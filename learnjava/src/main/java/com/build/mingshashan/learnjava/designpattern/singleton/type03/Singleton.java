package com.build.mingshashan.learnjava.designpattern.singleton.type03;

/**
 * 饿汉 （静态代码块）
 * 
 * @author Administrator
 *
 */
public class Singleton {

	private static Singleton instance;

	static {
		instance = new Singleton();
	}

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}

	public void test() {
		System.out.println("type03 singleton test --- 饿汉 （静态代码块）");
	}

}
