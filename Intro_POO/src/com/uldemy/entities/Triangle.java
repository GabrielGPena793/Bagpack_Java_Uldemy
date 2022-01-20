package com.uldemy.entities;

public class Triangle {

    private double a, b, c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double areaTriangulo(){
        double p = (this.a + this.b + this.c) /2.0;
        return Math.sqrt(p * (p - this.a) * (p - this.b) *(p - this.c));
    }

    public void maiorArea(double areaX, double areaY){
        if (areaX > areaY)
            System.out.println("Larger area : X");
        else if (areaX == areaY)
            System.out.println("Larger arae : equals");
        else
            System.out.println("Larger area: Y");
    }
}
