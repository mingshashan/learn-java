package com.build.mingshashan.learnjava.designpattern.abstractfactory;

public class Concrete1Factory implements AbstractFactory{
    public AbstractProductA CreateProductA() {
        return new Concrete1PruductA();
    }

    public AbstractProductB CreateProductB() {
        return new Concrete1PruductB();
    }
}
