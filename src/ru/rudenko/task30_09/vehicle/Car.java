package ru.rudenko.task30_09.vehicle;

/**
 * ref: https://docs.google.com/document/d/1X8c_KuZ8hvAo1krStu9UOi05icX950ZF1ETNYVOUojM/edit
 */
public class Car extends Vehicle {
    /**
     * @param x Координата x
     * @param y Координата y
     * @param price Стоимость транспорта
     * @param maxSpeed Максимальная скорость транспорта
     * @param releaseYear Дата релиза транспорта
     */
    public Car(double x, double y, double price, int maxSpeed, int releaseYear) {
        super(x, y, price, maxSpeed, releaseYear);
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
