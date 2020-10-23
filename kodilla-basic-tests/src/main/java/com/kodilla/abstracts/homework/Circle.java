package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    public Circle () {
        super(0,0,0,0,4);
    }

    @Override
    public double surfaceArea() {
        double circleSurface = (getPI() * getCircleRadius() * getCircleRadius());
        return circleSurface;
    }

    @Override
    public double perimeter() {
        double circlePerimeter = (2 * getPI() * getCircleRadius());
        return circlePerimeter;
    }
}
