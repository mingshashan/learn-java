package com.build.mingshashan.learnjava.designpattern.singleton.type06;

/**
 * 双重检查
 * 
 * @author Administrator
 *
 */
public class Singleton {
	private static volatile Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (null == instance) {
			synchronized (Singleton.class) {
				if (null == instance) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	public void test() {
		System.out.println("type06 singleton test --- 双重检查");
	}
}
