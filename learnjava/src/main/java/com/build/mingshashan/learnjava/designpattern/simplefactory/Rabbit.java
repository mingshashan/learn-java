package com.build.mingshashan.learnjava.designpattern.simplefactory;

/**
 * 兔子
 * 
 * @author Administrator
 *
 */
public class Rabbit extends Animal {

	@Override
	public void eat() {
		System.out.println("兔子吃草");
	}

	@Override
	public void run() {
		System.out.println("兔子奔跑");
	}

	@Override
	public String category() {
		return "兔子";
	}

}
