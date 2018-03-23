package com.build.mingshashan.learnjava.designpattern.abstractfactory;

public class Concrete2Factory implements AbstractFactory{
    public AbstractProductA CreateProductA() {
        return new Concrete2PruductA();
    }

    public AbstractProductB CreateProductB() {
        return new Concrete2PruductB();
    }
}
