package com.build.mingshashan.learnjava.designpattern.decorator;

public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();


        Decorator decorator = new ConcreteDecoratorB(component);

        decorator.sampleOperation();
    }
}
