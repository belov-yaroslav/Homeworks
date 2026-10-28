package com.area_of_geometric_figures;

public class Circle extends GeometricFigures {
    private final int radius;

    public Circle(int radius){
        this.radius = radius;
        amountOfFigures += 1;
    }

    @Override
    public double getArea(){
        return pi * radius * radius;
    }

}
