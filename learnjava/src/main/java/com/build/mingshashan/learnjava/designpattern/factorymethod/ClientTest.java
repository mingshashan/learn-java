package com.build.mingshashan.learnjava.designpattern.factorymethod;

public class ClientTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new SquareFactory();

        IShape shape = shapeFactory.productShape();

        shape.draw();
    }
}
