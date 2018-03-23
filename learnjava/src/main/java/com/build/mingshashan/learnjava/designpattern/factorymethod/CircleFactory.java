package com.build.mingshashan.learnjava.designpattern.factorymethod;

public class CircleFactory implements ShapeFactory{
    public IShape productShape() {
        return new CircleShape();
    }
}
