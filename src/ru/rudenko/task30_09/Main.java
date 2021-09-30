package ru.rudenko.task30_09;

/*
 * @author Rudenko, Latuskin
 * @created 30/09/2021
 * @project Main
 */

import ru.rudenko.task30_09.book.Book;
import ru.rudenko.task30_09.classroom.ClassRoom;
import ru.rudenko.task30_09.vehicle.Car;
import ru.rudenko.task30_09.vehicle.Plane;
import ru.rudenko.task30_09.vehicle.Ship;

/**
 * Входная точка для задач
 */
public class Main {
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(10, 20);
//        System.out.println(rectangle.perimeterCalculator());
//        System.out.println(rectangle.areaCalculator());
//
//        Book book = new Book("Нейромант", "Контет", "Гибсон");
//        book.show();

//        ClassRoom classRoom = new ClassRoom();
//        classRoom.show();

        Car car = new Car(10, 20, 20000, 160, 1999);
        car.showInfo();

        Ship ship = new Ship(150, 7123123, 9000.23, 90, 2000, 200, 2);
        ship.showInfo();

        Plane plane = new Plane(90, 10, 1000000, 500, 2014, 11000, 300);
        plane.showInfo();
    }
}
