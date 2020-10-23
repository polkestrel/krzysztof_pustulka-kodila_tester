package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square () {
        super(0,0,0,5,0);
    }

    @Override
    public double surfaceArea() {
        double squareSurface = getSquareSideLength() * getSquareSideLength();
        return squareSurface;
    }

    @Override
    public double perimeter() {
        double squarePerimeter = 4 * getSquareSideLength();
        return squarePerimeter;
    }
}
