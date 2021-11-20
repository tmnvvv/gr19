package ru.prac.storage;

import lombok.Getter;
import ru.prac.entity.Price;
import ru.prac.exceptions.ShopNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/*
 * @created 20.11.2021 - 16:50
 * @project 18_11_21 - prac
 * @author Polyakov Anton
 */

/**
 * Хранилище Price
 */
@Getter
public class PriceStorage {
    private ArrayList<Price> storage;

    public PriceStorage() {
        this.storage = new ArrayList<>();
    }

    /**
     * @param goodName название товара
     * @param shopName название магазина
     * @param costInHryvnia стоимость товара в гривнах
     */
    public void addToStorage(String goodName, String shopName, String costInHryvnia){
        storage.add(new Price(goodName, shopName, costInHryvnia));
    }

    /**
     * Метод для поиска товаров по названию магазина
     * @param shopName название магазина
     * @return ArrayList<String> с данными о товарах
     * @throws ShopNotFoundException
     */
    public ArrayList<String> findGoodsByShopName(String shopName) throws ShopNotFoundException{
        ArrayList<String> goods = new ArrayList<>();
        for (Price price : storage) {
            if (price.getShopName().toLowerCase(Locale.ROOT).equals(shopName.toLowerCase(Locale.ROOT))){
                goods.add(price.getStringInformation());
            }
            throw new ShopNotFoundException(shopName);
        }
        return goods;
    }

    /**
     * Метод для получения данных из хранилища, отсортированных по названию магазинов
     * @return отсортированное по названию магазинов хранилище Price в виде ArrayList<Price>
     */
    public ArrayList<Price> getSortedByShopNameStorage(){
        ArrayList<Price> tempArray = new ArrayList<>(storage);
        Collections.sort(tempArray, (o1, o2) -> o1.getShopName().compareTo(o2.getShopName()));
        return tempArray;
    }
}