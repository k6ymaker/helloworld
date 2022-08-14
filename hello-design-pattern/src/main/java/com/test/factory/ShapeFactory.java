package com.test.factory;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}
