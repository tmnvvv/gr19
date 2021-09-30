package ru.rudenko.task30_09.vehicle;

public class Ship extends Vehicle {
    private double numberOfPassengers;
    private int port;

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

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Порт приписки: " + getPort());
        System.out.println("Максимальное число пассажиров: " + getNumberOfPassengers());
    }
}
