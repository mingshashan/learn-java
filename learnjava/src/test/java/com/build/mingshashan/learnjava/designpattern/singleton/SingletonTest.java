package com.build.mingshashan.learnjava.designpattern.singleton;

import junit.framework.TestCase;

public class SingletonTest extends TestCase {

	public void testSingleton() {
		com.build.mingshashan.learnjava.designpattern.singleton.type01.Singleton.getInstance().test();
		com.build.mingshashan.learnjava.designpattern.singleton.type02.Singleton.getInstance().test();
		com.build.mingshashan.learnjava.designpattern.singleton.type03.Singleton.getInstance().test();
		com.build.mingshashan.learnjava.designpattern.singleton.type04.Singleton.getInstance().test();
		com.build.mingshashan.learnjava.designpattern.singleton.type05.Singleton.getInstance().test();
		com.build.mingshashan.learnjava.designpattern.singleton.type06.Singleton.getInstance().test();
		com.build.mingshashan.learnjava.designpattern.singleton.type07.Singleton.getInstance().test();
		
		com.build.mingshashan.learnjava.designpattern.singleton.type08.Singleton.INSTANCE.test();
	}
}
