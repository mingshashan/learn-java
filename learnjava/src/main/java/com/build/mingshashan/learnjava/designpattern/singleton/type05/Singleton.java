package com.build.mingshashan.learnjava.designpattern.singleton.type05;

/**
 * 懒汉模式（在实例化单例类的时候加同步锁，线程不安全还是有可能产生多个实例） 
 * @author Administrator
 *
 */
public class Singleton {
	private static Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (null == instance) {
			synchronized (Singleton.class) {
				instance = new Singleton();
			}
		}
		return instance;
	}
	
	public void test() {
		System.out.println("type05 singleton test --- 懒汉模式（在实例化单例类的时候加同步锁，线程不安全还是有可能产生多个实例）");
	}
}
