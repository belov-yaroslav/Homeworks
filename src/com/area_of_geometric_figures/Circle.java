package com.area_of_geometric_figures;

public class Circle extends GeometricFigures {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
        amountOfFigures += 1;
    }

    public double getArea(){
        return pi * radius * radius;
    }
}
