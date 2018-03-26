package com.build.mingshashan.learnjava.designpattern.decorator;

public class ConcreteDecoratorA extends Decorator{


    public ConcreteDecoratorA(Component component) {

        super(component);
    }

    @Override
    public void sampleOperation() {
        System.out.println("A装饰");
        super.sampleOperation();
        System.out.println("A装饰");
    }
}
