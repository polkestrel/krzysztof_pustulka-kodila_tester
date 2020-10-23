package com.kodilla.abstracts.homework;

public abstract class Shape {           //deklaracja klasy abstrakcyjnej 'Shape'


    /*
    deklaracja zmiennych
     */

    private double triangleSideLengthA, triangleSideLengthB, triangleSideLengthC;
    private double squareSideLength;
    private double circleRadius;
    private final double PI = 3.1415927;


    /*
    deklaracja getter'ów wszystkich zmiennych
     */

    public double getTriangleSideLengthA() {
        return triangleSideLengthA;
    }
    public double getTriangleSideLengthB() {
        return triangleSideLengthB;
    }
    public double getTriangleSideLengthC() {
        return triangleSideLengthC;
    }
    public double getSquareSideLength() {
        return squareSideLength;
    }
    public double getCircleRadius() {
        return circleRadius;
    }
    public double getPI() {
        return PI;
    }


    /*
    deklaracja konstruktora 'Shape'
     */

    public Shape (double triangleSideLengthA, double triangleSideLengthB, double triangleSideLengthC, double squareSideLength, double circleRadius) {
        this.triangleSideLengthA = triangleSideLengthA;
        this.triangleSideLengthB = triangleSideLengthB;
        this.triangleSideLengthC = triangleSideLengthC;
        this.squareSideLength = squareSideLength;
        this.circleRadius = circleRadius;
    }

    /*
    deklaracja metod abstrakcyjnych
     */

    public abstract double surfaceArea ();        //deklaracja metody abstrakcyjnej obliczającej pole powierzchni figury
    public abstract double perimeter ();      //deklaracja metody abstrakcyjnej obliczającej obwód figury
}
