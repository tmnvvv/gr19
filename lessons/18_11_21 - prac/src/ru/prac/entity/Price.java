package ru.prac.entity;

import lombok.Getter;

/*
 * @created 20.11.2021 - 16:50
 * @project 18_11_21 - prac
 * @author Polyakov Anton
 */

/**
 * Класс Price
 */
@Getter
public class Price {
    String goodName;
    String shopName;
    String costInHryvnia;

    /**
     * @param goodName название товара
     * @param shopName название магазина
     * @param costInHryvnia стоимость товара в гривнах
     */
    public Price(String goodName, String shopName, String costInHryvnia) {
        this.goodName = goodName;
        this.shopName = shopName;
        this.costInHryvnia = costInHryvnia;
    }

    /**
     * Метод для получения всей информации об объекте в виде String
     * @return String
     */
    public String getStringInformation(){
        return "GoodName: " + goodName + ". ShopName: " + shopName + ". Cost in hryvnia: " + costInHryvnia;
    }
}