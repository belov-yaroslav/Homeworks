package com.area_of_geometric_figures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Условие: Реализовать систему для вычисления площадей различных фигур.
        //Есть круг и прямоугольник. Все фигуры должны иметь метод getArea().
        //Программа должна уметь хранить различные фигуры в одном массиве и вычислять их общую площадь.

//        GeometricFigures[] geometricFigures = new GeometricFigures[2];
//
//        geometricFigures[0] = new Circle(5);
//        geometricFigures[1] = new Rectangle(5, 10);
//        double sumOfArea = 0;
//        for (GeometricFigures geometricFigure : geometricFigures) {
//            sumOfArea += geometricFigure.getArea();
//        }
//
//        System.out.println(sumOfArea);


        Scanner scanner = new Scanner(System.in);
        int amountOfArray = scanner.nextInt();
        GeometricFigures geometricFigures = new GeometricFigures();
        geometricFigures.setSizeOfArray(amountOfArray);
        geometricFigures.toArray(new Circle(5));
        geometricFigures.toArray(new Rectangle(5, 10));
        geometricFigures.toArray(new Rectangle(12, 15));
        System.out.println(geometricFigures.sumOfSquares());
    }
}
