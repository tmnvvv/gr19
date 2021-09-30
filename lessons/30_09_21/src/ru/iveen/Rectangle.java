package ru.iveen;
/*
 * @created 30.09.2021 - 20:25
 * @project 30_09_21
 * @author Polyakov Anton
 */
public class Rectangle {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    /**
     * Метод вычисления площади прямоугольника
     */
    public double areaCalculator() {
        return this.side1 * this.side2;
    }

    /**
     * Метод вычисления периметра прямоугольника
     */
    public double perimeterCalculator() {
        return this.side1 * 2 + this.side2 * 2;
    }
}