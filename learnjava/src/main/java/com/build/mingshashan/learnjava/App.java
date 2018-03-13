package com.build.mingshashan.learnjava;

/**
 * Hello world!
 *
 */
public class App {

	int i1;

	int i2;

	public static void main(String[] args) {
		System.out.println("Hello World!");

		String letter = "o";

		String s = "hello";

		String t = "hell" + letter;

		if (s == t)
			System.out.println("equal ==");

		if (s.equals(t))
			System.out.println("equal equals");

		App a = new App();
		App b = a;

		if (a == b) {
			System.out.println("equal ==");
		}

		if (a.equals(b)) {
			System.out.println("equal equals");
		}
	}

	@Override
	public boolean equals(Object obj) {

		return (i1 == i1) && (i2 == i2);
	}

	@Override
	public String toString() {
		return "i1 = [" + i1 + "]; i2 = [" + i2 + "]";
	}
}
