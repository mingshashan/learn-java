package com.build.mingshashan.learnjava.designpattern.simplefactory;

import junit.framework.TestCase;

/**
 * 工厂测试类
 * 
 * @author Administrator
 *
 */
public class AnimalTest extends TestCase {

	public void testFactory() {
		Animal horse = AnimalFactory.createAnimal(AnimalCategory.Horse);
		Animal rabbit = AnimalFactory.createAnimal(AnimalCategory.Rabbit);
		Animal tiger = AnimalFactory.createAnimal(AnimalCategory.Tiger);

		horse.eat();
		horse.run();
		System.out.println(horse.category());

		rabbit.eat();
		rabbit.run();
		System.out.println(rabbit.category());

		tiger.eat();
		tiger.run();
		System.out.println(tiger.category());

	}
}
