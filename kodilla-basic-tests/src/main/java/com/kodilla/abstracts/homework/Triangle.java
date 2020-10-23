package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle () {
        super(2,3, 4,0,0);
    }

    @Override
    public double surfaceArea() { ;
        double triangleSurface = (getTriangleSideLengthC() * (Math.sqrt((getTriangleSideLengthB() * getTriangleSideLengthB()) - (getTriangleSideLengthC() * getTriangleSideLengthC())/4)))/2;
        return triangleSurface;
    }

    @Override
    public double perimeter() {
        double trianglePerimeter = getTriangleSideLengthA() + getTriangleSideLengthB() + getTriangleSideLengthC();
        return trianglePerimeter;
    }
}
