package com.area_of_geometric_figures;

public abstract class GeometricFigures {
    protected double pi = Math.PI;
    protected static int amountOfFigures;

    public abstract double getArea();

    public int getAmountOfFigures(){
        return amountOfFigures;
    }

}
