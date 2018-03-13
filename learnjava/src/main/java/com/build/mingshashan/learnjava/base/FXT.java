package com.build.mingshashan.learnjava.base;

public class FXT {
	private Object ob; // 定义泛型成员变量

	public FXT(Object ob) {
		this.ob = ob;
	}

	public Object getOb() {
		return ob;
	}

	public void showTyep() {
		System.out.println("T的实际类型是: " + ob.getClass().getName());
	}

	public static void main(String[] args) {
		FXT intOb = new FXT(new Integer(100));
		intOb.showTyep();
		System.out.println("value= " + intOb.getOb());
		System.out.println("----------------------------------");

		FXT strOb = new FXT("CSDN_SEU_Calvin");
		strOb.showTyep();
		System.out.println("value= " + strOb.getOb());
	}
}
