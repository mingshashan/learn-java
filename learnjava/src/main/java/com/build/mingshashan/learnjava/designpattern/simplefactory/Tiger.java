package com.build.mingshashan.learnjava.designpattern.simplefactory;

/**
 * 老虎
 * 
 * @author Administrator
 *
 */
public class Tiger extends Animal {

	@Override
	public void eat() {
		System.out.println("老虎吃肉");
	}

	@Override
	public void run() {
		System.out.println("老虎奔跑");
	}

	@Override
	public String category() {
		return "老虎";
	}

}
