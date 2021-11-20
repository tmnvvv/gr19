package ru.prac;

import lombok.SneakyThrows;
import ru.prac.utils.Calculator;
import ru.prac.entity.Price;
import ru.prac.entity.Worker;
import ru.prac.storage.PriceStorage;
import ru.prac.storage.WorkersStorage;
import ru.prac.utils.DateValidator;

import java.text.ParseException;
import java.util.Scanner;

/*
 * @created 20.11.2021 - 15:17
 * @project 18_11_21 - prac
 * @author Polyakov Anton
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        WorkersStorage workersStorage = new WorkersStorage();
        PriceStorage priceStorage = new PriceStorage();
        Scanner scanner = new Scanner(System.in);
        DateValidator dateValidator = new DateValidator();
        final String PATTERN = "dd.MM.yyyy";

        // Задание 1
        Calculator calculator = new Calculator();
        System.out.println(calculator.add());
        System.out.println(calculator.sub());
        System.out.println(calculator.mul());
        System.out.println(calculator.div());

        // Задание 2
        int workersCount = 5;
        for (int i=1; i<workersCount+1; i++) {
            System.out.println("Введите имя и инициалы сотрудника. " + i + "/" + workersCount);
            String workerName = scanner.next();

            System.out.println("Введите должность сотрудника. " + i + "/" + workersCount);
            String workerPost = scanner.next();

            System.out.println("Введите дату начала работы сотрудника, согласно паттерну: " + PATTERN + ". " + i + "/" + workersCount);
            String yearOfWorking = scanner.next();

            try {
                dateValidator.validate(PATTERN, yearOfWorking);
                workersStorage.addToStorage(workerName, workerPost, yearOfWorking);
            } catch (ParseException E) {
                System.out.println("Неверный формат даты.");
            }
        }
        for (Worker worker : workersStorage.getSortedByWorkerNameStorage()){
            System.out.println(worker.getStringInformation());
        }

        // Задание 3
        int priceCount = 3;
        for (int i=1; i<priceCount+1; i++) {
            System.out.println("Введите название товара. " + i + "/" + priceCount);
            String goodName = scanner.next();

            System.out.println("Введите название магазина. " + i + "/" + priceCount);
            String shopName = scanner.next();

            System.out.println("Введите стоимость товара в гривнах. " + i + "/" + priceCount);
            String goodCost = scanner.next();

            priceStorage.addToStorage(goodName, shopName, goodCost);
        }
        for (Price price: priceStorage.getSortedByShopNameStorage()){
            System.out.println(price.getStringInformation());
        }
        System.out.println(priceStorage.findGoodsByShopName("яндеКс"));
    }
}
