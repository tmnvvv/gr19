package ru.rudenko.task30_09.vehicle;

/**
 * ref: https://docs.google.com/document/d/1X8c_KuZ8hvAo1krStu9UOi05icX950ZF1ETNYVOUojM/edit
 */
public class Plane extends Vehicle{
    private double height;
    private double numberOfPassengers;

    /**
     * @param x Координата x
     * @param y Координата y
     * @param price Стоимость транспорта
     * @param maxSpeed Максимальная скорость транспорта
     * @param releaseYear Дата релиза транспорта
     * @param height Высота
     * @param numberOfPassengers Вместимость транспорта
     */
    public Plane(double x, double y, double price, int maxSpeed, int releaseYear, double height, double numberOfPassengers) {
        super(x, y, price, maxSpeed, releaseYear);
        this.height = height;
        this.numberOfPassengers = numberOfPassengers;
    }

    public double getHeight() {
        return height;
    }

    public double getNumberOfPassengers() {
        return numberOfPassengers;
    }

    /**
     * Выводит информацию о транспорте
     */
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Высота: " + getHeight());
        System.out.println("Максимальное число пассажиров: " + getNumberOfPassengers());
    }
}
