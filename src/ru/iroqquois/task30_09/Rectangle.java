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
    public double side1;
    public double side2;


    /**
     * Метод вычисляет площадь прямоугольника
     *
     * @param side1 Первая сторона прямоугольника
     * @param side2 Вторая сторона прямоугольника
     * @return Возвращает площадь прямоугольника
     */
    public double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    /**
     * Метод вычисляет периметр прямоугольника
     *
     * @param side1 Первая сторона прямоугольника
     * @param side2 Вторая сторона прямоугольника
     * @return Возвращает периметр прямоугольник
     */
    public double perimeterCalculator(double side1, double side2) {
        return side1 * 2 + side2 * 2;
    }
}
