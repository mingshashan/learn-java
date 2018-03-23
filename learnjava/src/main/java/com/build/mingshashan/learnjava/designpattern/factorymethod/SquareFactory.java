package com.build.mingshashan.learnjava.designpattern.factorymethod;

public class SquareFactory implements ShapeFactory{

    public IShape productShape() {
        return new SquareShape();
    }
}
