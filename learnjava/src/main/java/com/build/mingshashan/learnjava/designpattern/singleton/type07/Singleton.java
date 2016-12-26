package com.build.mingshashan.learnjava.designpattern.singleton.type07;

/**
 * 静态内部类
 * 
 * @author Administrator
 *
 */
public class Singleton {

	private Singleton() {
	}

	private static class Instance {
		private final static Singleton INSTANCE = new Singleton();
	}

	public static Singleton getInstance() {
		return Instance.INSTANCE;
	}

	public void test() {
		System.out.println("type07 singleton test --- 静态内部类");
	}
}
