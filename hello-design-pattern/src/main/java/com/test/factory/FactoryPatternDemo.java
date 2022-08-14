package com.test.factory;

public class FactoryPatternDemo {
    //属于创建模式，该demo为简单工厂，目的是为了降低封装对象创建的复杂性
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Square");
        shape3.draw();
    }
}
