package ru.rudenko.task18_11.price;

/*
 * @created 18/11/2021
 * @project Price
 * @author Rudenko
 */

public class Price implements Comparable<Price> {
    private String productName;
    private String storeName;
    private Integer price;

    public Price(String productName, String storeName, Integer price) {
        this.productName = productName;
        this.storeName = storeName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getStoreName() {
        return storeName;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public int compareTo(Price o) {
        return toString().compareTo(o.storeName);
    }

    @Override
    public String toString() {
        return "Price{" +
                "productName='" + productName + '\'' +
                ", storeName='" + storeName + '\'' +
                ", price=" + price +
                '}';
    }
}
