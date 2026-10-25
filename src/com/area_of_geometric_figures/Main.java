package com.area_of_geometric_figures;

public class Main {
    public static void main(String[] args){
        //Условие: Реализовать систему для вычисления площадей различных фигур.
        //Есть круг и прямоугольник. Все фигуры должны иметь метод getArea().
        //Программа должна уметь хранить различные фигуры в одном массиве и вычислять их общую площадь.

        GeometricFigures[] geometricFigures = new GeometricFigures[2];

        geometricFigures[0] = new Circle(5);
        geometricFigures[1] = new Rectangle(5, 10);
        double sumOfArea = 0;
        for (GeometricFigures geometricFigure : geometricFigures) {
            sumOfArea += geometricFigure.getArea();
        }

        System.out.println(sumOfArea);
    }
}
