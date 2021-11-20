package entity.vehicle;

/*
 * @created 07.10.2021 - 11:48
 * @project 07_10_2021
 * @author Polyakov Anton
 */
public class Plane extends Vehicle{
    protected double height;
    protected int passengerCapacity;
    public Plane(double cord_x, double cord_y, double price, double speedLimit, int releaseDate, double height, int passengerCapacity) {
        super(cord_x, cord_y, price, speedLimit, releaseDate);
        this.height = height;
        this.passengerCapacity = passengerCapacity;
    }

    public void print() {
        System.out.println("\n" + this.getClass().getName());
        System.out.println("Координаты: " + cord_x + ":" + cord_y);
        System.out.println("Высота: " + height);
        System.out.println("Вместимость пассажиров: " + passengerCapacity);
        System.out.println("Стоимость: " + price);
        System.out.println("Максимальная скорость: " + speedLimit);
        System.out.println("Дата выпуска: " + releaseDate);
    }
}
