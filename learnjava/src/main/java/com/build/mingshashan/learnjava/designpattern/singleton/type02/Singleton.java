package com.build.mingshashan.learnjava.designpattern.singleton.type02;

/**
 * 饿汉 （静态常量）
 * @author Administrator
 *
 */
public class Singleton {

	private static final Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}

	public void test() {
		System.out.println("type02 singleton test --- 饿汉 （静态常量）");
	}

}
