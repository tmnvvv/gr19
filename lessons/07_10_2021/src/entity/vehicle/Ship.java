package entity.vehicle;

/*
 * @created 07.10.2021 - 11:49
 * @project 07_10_2021
 * @author Polyakov Anton
 */
public class Ship extends Vehicle{
    protected String board;
    protected int passengerCapacity;
    public Ship(double cord_x, double cord_y, double price, double speedLimit, int releaseDate, int passengerCapacity, String board) {
        super(cord_x, cord_y, price, speedLimit, releaseDate);
        this.board = board;
        this.passengerCapacity = passengerCapacity;
    }

    public void print() {
        System.out.println("\n" + this.getClass().getName());
        System.out.println("Координаты: " + cord_x + ":" + cord_y);
        System.out.println("Борт приписки: " + board);
        System.out.println("Вместимость пассажиров: " + passengerCapacity);
        System.out.println("Стоимость: " + price);
        System.out.println("Максимальная скорость: " + speedLimit);
        System.out.println("Дата выпуска: " + releaseDate);
    }
}
