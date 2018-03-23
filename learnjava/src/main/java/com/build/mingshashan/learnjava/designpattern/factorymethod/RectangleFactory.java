package com.build.mingshashan.learnjava.designpattern.factorymethod;

public class RectangleFactory implements ShapeFactory{
    public IShape productShape() {
        return new RectangleShape();
    }
}
