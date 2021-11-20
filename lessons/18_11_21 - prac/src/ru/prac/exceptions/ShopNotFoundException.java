package ru.prac.exceptions;

/*
 * @created 20.11.2021 - 16:52
 * @project 18_11_21 - prac
 * @author Polyakov Anton
 */

/**
 * Custom exception for notFoundShop
 */
public class ShopNotFoundException extends Exception{
    /**
     * @param shopName название магазина
     */
    public ShopNotFoundException(String shopName) {
        super("Shop " + shopName + " not found!");
    }
}