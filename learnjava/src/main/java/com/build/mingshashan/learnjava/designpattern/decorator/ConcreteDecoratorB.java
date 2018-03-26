package com.build.mingshashan.learnjava.designpattern.decorator;

public class ConcreteDecoratorB extends Decorator{
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        System.out.println("B装饰");
        super.sampleOperation();
        System.out.println("B装饰");

    }
}
