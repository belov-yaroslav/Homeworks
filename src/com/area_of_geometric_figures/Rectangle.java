package com.area_of_geometric_figures;

public class Rectangle extends GeometricFigures {
    private final int length;
    private final int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
        amountOfFigures += 1;
    }

    @Override
    public double getArea(){
        return length * width;
    }
}
