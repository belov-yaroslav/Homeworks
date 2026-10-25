package com.area_of_geometric_figures;

public class Rectangle extends GeometricFigures {
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
        amountOfFigures += 1;
    }

    public double getArea(){
        return length * width;
    }
}
