package com.build.mingshashan.learnjava.designpattern.proxy.staticproxy;

public class RealSubject implements Subject{
	public void dealTask(String taskName) {
		System.out.printf("execute task = [%s] ", taskName);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

}
