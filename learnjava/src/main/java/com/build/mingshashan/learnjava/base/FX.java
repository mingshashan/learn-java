package com.build.mingshashan.learnjava.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FX<T> {

	private T pro1;

	public FX() {
	}

	public FX(T pro1) {
		this.pro1 = pro1;
	}

	public void displayValue() {
		System.out.printf("pro1的值为: %s, pro1的类型为: %s \r", pro1.toString(), pro1.getClass().getName());
	}

	public static void main(String[] args) {
		FX<Integer> fx1 = new FX<Integer>(1);
		fx1.displayValue();

		FX<Double> fx2 = new FX<Double>(1.3);
		fx2.displayValue();

		FX<String> fx3 = new FX<String>("猜猜我是谁");
		fx3.displayValue();

	}
}
