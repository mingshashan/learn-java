package com.build.mingshashan.learnjava.designpattern.singleton.type04;

/**
 * 懒汉模式（在getInstance()方法加同步锁，线程安全）
 * 
 * @author Administrator
 *
 */
public class Singleton {

	private static Singleton instance = null;

	private Singleton() {
	}

	public synchronized static Singleton getInstance() {
		if (null == instance) {
			instance = new Singleton();
		}
		return instance;
	}

	public void test() {
		System.out.println("type04 singleton test --- 懒汉模式（在getInstance()方法加同步锁，线程安全）");
	}

}
