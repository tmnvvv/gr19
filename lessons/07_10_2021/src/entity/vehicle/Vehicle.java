package entity.vehicle;

/*
 * @created 07.10.2021 - 11:48
 * @project 07_10_2021
 * @author Polyakov Anton
 */
public class Vehicle {
    protected double cord_x;
    protected double cord_y;
    protected double price;
    protected double speedLimit;
    protected int releaseDate;

    public Vehicle(double cord_x, double cord_y, double price, double speedLimit, int releaseDate) {
        this.cord_x = cord_x;
        this.cord_y = cord_y;
        this.price = price;
        this.speedLimit = speedLimit;
        this.releaseDate = releaseDate;
    }

    public void print() {
        System.out.println("\n" + this.getClass().getName());
        System.out.println("Координаты: " + cord_x + ":" + cord_y);
        System.out.println("Стоимость: " + price);
        System.out.println("Максимальная скорость: " + speedLimit);
        System.out.println("Дата выпуска: " + releaseDate);
    }
}
