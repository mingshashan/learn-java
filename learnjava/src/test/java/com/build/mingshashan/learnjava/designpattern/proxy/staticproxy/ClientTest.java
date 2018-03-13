package com.build.mingshashan.learnjava.designpattern.proxy.staticproxy;

import org.junit.Test;

public class ClientTest {

	@Test
	public void test() {
		Subject proxySubject = SubjectStaticFactory.getInstance();
		
		proxySubject.dealTask("test");
	}
	
}
