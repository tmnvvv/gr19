package ru.rudenko.task30_09.vehicle;

/**
 * ref: https://docs.google.com/document/d/1X8c_KuZ8hvAo1krStu9UOi05icX950ZF1ETNYVOUojM/edit
 */
public class Vehicle {
    private double x;
    private double y;
    private double price;
    private int maxSpeed;
    private int releaseYear;

    /**
     * @param x Координата x
     * @param y Координата y
     * @param price Стоимость транспорта
     * @param maxSpeed Максимальная скорость транспорта
     * @param releaseYear Дата релиза транспорта
     */
    public Vehicle(double x, double y, double price, int maxSpeed, int releaseYear) {
        this.x = x;
        this.y = y;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.releaseYear = releaseYear;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getPrice() {
        return price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    /**
     * Выводит информацию о транспорте
     */
    protected void showInfo() {
        System.out.println("Информация о транспорте: ");
        System.out.println("Координата x: " + getX());
        System.out.println("Координата y: " + getY());
        System.out.println("Цена: " + getPrice());
        System.out.println("Максимальная скорость: " + getMaxSpeed());
        System.out.println("Год выхода: " + getReleaseYear());
    }
}
