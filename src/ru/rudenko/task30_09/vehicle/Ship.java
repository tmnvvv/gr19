package ru.rudenko.task30_09.vehicle;

/**
 * ref: https://docs.google.com/document/d/1X8c_KuZ8hvAo1krStu9UOi05icX950ZF1ETNYVOUojM/edit
 */
public class Ship extends Vehicle {
    private double numberOfPassengers;
    private int port;

    /**
     * @param x Координата x
     * @param y Координата y
     * @param price Стоимость транспорта
     * @param maxSpeed Максимальная скорость транспорта
     * @param releaseYear Дата релиза транспорта
     * @param numberOfPassengers Вместимость транспорта
     * @param port Порт приписки транспорта
     */
    public Ship(double x, double y, double price, int maxSpeed, int releaseYear, double numberOfPassengers, int port) {
        super(x, y, price, maxSpeed, releaseYear);
        this.numberOfPassengers = numberOfPassengers;
        this.port = port;
    }

    public double getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public int getPort() {
        return port;
    }

    /**
     * Выводит информацию о транспорте
     */
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Порт приписки: " + getPort());
        System.out.println("Максимальное число пассажиров: " + getNumberOfPassengers());
    }
}
