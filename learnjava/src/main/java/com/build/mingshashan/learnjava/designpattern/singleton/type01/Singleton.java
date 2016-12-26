package com.build.mingshashan.learnjava.designpattern.singleton.type01;

/**
 * 懒汉模式（线程不安全） 
 * @author Administrator
 *
 */
public class Singleton {
	private static Singleton instance = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (null == instance) {
			instance = new Singleton();
		}

		return instance;
	}

	public void test() {
		System.out.println("type01 singleton test --- 懒汉模式（线程不安全） ");
	}
}
