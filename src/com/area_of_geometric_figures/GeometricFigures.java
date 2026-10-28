package com.area_of_geometric_figures;

public class GeometricFigures {
    private GeometricFigures[] geometricFigures;
    protected double pi = Math.PI;
    protected static int amountOfFigures = 0;
    protected static int amountOfFiguresInArray = 0;

    public double getArea(){ // Заглушка для переписывания
        return 0;
    }

    public void toArray(GeometricFigures figure){ // Складываю фигуры в массив
        geometricFigures[amountOfFiguresInArray] = figure;
        amountOfFiguresInArray += 1;
    }

    public void setSizeOfArray(int size){ geometricFigures = new GeometricFigures[size];} // Задаю размер массива



    public int getAmountOfFigures(){
        return amountOfFigures;
    } // возвращаю количество созданных фигур

    public double sumOfSquares(){ // сумма площадей
        double sum = 0;
        for (GeometricFigures geometricFigure: geometricFigures){
            sum += geometricFigure.getArea();
        }

        return sum;
    }

//    public GeometricFigures[] getGeometricFigures() { return geometricFigures;}

//    public void setGeometricFigures(GeometricFigures[] geometricFigures) { this.geometricFigures = geometricFigures; }
}
