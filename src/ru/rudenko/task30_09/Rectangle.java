package ru.rudenko.task30_09;

/*
 * @author Rudenko, Latuskin
 * @created 30/09/2021
 * @project Rectangle
 */

/**
 * Класс для работы с прямоугольником
 * ref: https://docs.google.com/document/d/1ViQ4jsXUTtBz22MzxXpsnSmTBSNjlH8tfJP-_RE7C3Y/edit
 */
public class Rectangle {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    /**
     * Метод вычисляет площадь прямоугольника
     *
     * @return Возвращает площадь прямоугольника
     */
    public double areaCalculator() {
        return side1 * side2;
    }

    /**
     * Метод вычисляет периметр прямоугольника
     *
     * @return Возвращает периметр прямоугольник
     */
    public double perimeterCalculator() {
        return side1 * 2 + side2 * 2;
    }
}
