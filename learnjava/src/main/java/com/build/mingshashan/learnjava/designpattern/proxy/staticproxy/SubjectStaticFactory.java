package com.build.mingshashan.learnjava.designpattern.proxy.staticproxy;

public class SubjectStaticFactory {
	public static Subject getInstance() {
		return new ProxySubject(new RealSubject());
	}
}
