package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.Random;

public class ShapeApplication {

    public static void main(String[] args) {
        // pusta tablica, która będzie przechowywać elementy od 1 do 20
        Random random = new Random();
        Shape[] shapes = new Shape[random.nextInt(20) + 1];
        //wywołajmy metodę drawShape tyle razy, ile elementów będzie w tablicy
        for (int n = 0; n < shapes.length; n++)
            shapes[n] = drawShape();
        //wyświetlamy informacje o wymiarach dla każdego elementu w tablicy
        for (Shape shape : shapes)
            ShapeUtils.displayShapeInfo(shape);
    }

    private static Shape drawShape() {
        Random random = new Random();
        // draw a kind of the shape
        int drawnShapeKind = random.nextInt(3);     //possible values: 0,1,2
        // draw dimensions values of the shape
        double a = random.nextDouble() * 100 + 1;          //possible values: 1.000-100.999
        double b = random.nextDouble() * 100 + 1;
        double c = random.nextDouble() * 100 + 1;
        if (drawnShapeKind == 0)
            return new Circle(a);
        else if (drawnShapeKind == 1)
            return new Square(a);
        else
            return new Triangle(a,b,c);
    }
}
