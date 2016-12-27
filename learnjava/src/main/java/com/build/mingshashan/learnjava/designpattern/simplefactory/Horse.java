package com.build.mingshashan.learnjava.designpattern.simplefactory;

/**
 * 马
 * 
 * @author Administrator
 *
 */
public class Horse extends Animal {

	@Override
	public void eat() {
		System.out.println("马吃草");
	}

	@Override
	public void run() {
		System.out.println("马儿奔跑");
	}

	@Override
	public String category() {
		return "马";
	}

}
