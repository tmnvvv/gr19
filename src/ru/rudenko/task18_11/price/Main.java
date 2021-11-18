package ru.rudenko.task18_11.price;

/*
 * @created 18/11/2021
 * @project Price
 * @author Rudenko
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<Price> priceList = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int i = 0;

        while (i < 2) {
            System.out.print("Input product name: ");
            String productName = in.next();

            System.out.print("Input store name: ");
            String storeName = in.next();

            System.out.print("Input price: ");
            int price = in.nextInt();

            priceList.add(new Price(productName, storeName, price));

            i++;
        }

        Collections.sort(priceList);

        System.out.print("Input store name: ");
        String inputStoreName = in.next();

        boolean searchStatus = false;

        for (Price price : priceList) {
            if (price.getStoreName().equalsIgnoreCase(inputStoreName)) {
                System.out.println(price);
                searchStatus = true;
            }
        }

        try {
            checkSearchStatus(searchStatus);
        } catch (RuntimeException exception) {
            System.out.println("Магазин не был найден");
        }
    }

    public static void checkSearchStatus(boolean status) throws RuntimeException {
        if (!status) { throw new RuntimeException(); }
    }
}
