package com.build.mingshashan.learnjava.designpattern.simplefactory;

public class AnimalFactory {
	public static Animal createAnimal(AnimalCategory category) {

		Animal animal = null;

		switch (category) {
		case Horse:
			animal = new Horse();
			break;
		case Rabbit:
			animal = new Rabbit();
			break;
		case Tiger:
			animal = new Tiger();
			break;

		default:
			throw new IllegalArgumentException("no this category [" + category.toString() + "]");
		}

		return animal;
	}
}
