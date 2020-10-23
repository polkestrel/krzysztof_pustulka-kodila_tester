package com.kodilla.abstracts.homework;

public class ShapeApplication {

    public static void main(String[] args) {
        Shape square = new Square();
        System.out.println("------------------\nPowierzchnia kwadratu równobocznego o boku: " + square.getSquareSideLength() + " cm wynosi: " + square.surfaceArea() + " cm2.");
        System.out.println("Obwód kwadratu równobocznego o boku: " + square.getSquareSideLength() + " cm wynosi: " + square.perimeter() + " cm");

        Shape circle = new Circle();
        System.out.println("------------------\nPowierzchnia koła o promieniu: " + circle.getCircleRadius() + " cm wynosi: " + circle.surfaceArea() + " cm2.");
        System.out.println("Obwód koła o promieniu: " + circle.getCircleRadius() + " cm wynosi: " + circle.perimeter() + " cm");

        Shape triangle = new Triangle();
        System.out.println("------------------\nPowierzchnia trójkąta o podstawie równej: " + triangle.getTriangleSideLengthC() + " cm wynosi: " + triangle.surfaceArea() + " cm2.");
        System.out.println("Obwód trójkata o bokach: " + triangle.getTriangleSideLengthA() + ", " + triangle.getTriangleSideLengthB() + ", " + triangle.getTriangleSideLengthC() + " cm wynosi: " + triangle.perimeter() + " cm");
    }
}
