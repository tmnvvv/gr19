package ru.rudenko.task30_09.vehicle;

public class Plane extends Vehicle{
    private double height;
    private double numberOfPassengers;

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

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Высота: " + getHeight());
        System.out.println("Максимальное число пассажиров: " + getNumberOfPassengers());
    }
}
