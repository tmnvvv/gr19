package ru.rudenko.task30_09.vehicle;

public class Vehicle {
    private double x;
    private double y;
    private double price;
    private int maxSpeed;
    private int releaseYear;

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

    protected void showInfo() {
        System.out.println("Информация о транспорте: ");
        System.out.println("Координата x: " + getX());
        System.out.println("Координата y: " + getY());
        System.out.println("Цена: " + getPrice());
        System.out.println("Максимальная скорость: " + getMaxSpeed());
        System.out.println("Год выхода: " + getReleaseYear());
    }
}
