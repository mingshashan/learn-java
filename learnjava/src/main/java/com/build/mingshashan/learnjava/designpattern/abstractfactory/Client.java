package com.build.mingshashan.learnjava.designpattern.abstractfactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new Concrete2Factory();

        factory.CreateProductA().whoami();
        factory.CreateProductB().whoami();
    }
}
