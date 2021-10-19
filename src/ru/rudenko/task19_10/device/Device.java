package ru.rudenko.task19_10.device;

/*
 * @created 19/10/2021
 * @project Device
 * @author Rudenko, Latushkin
 */

import java.util.Objects;

/**
 * ref: https://drive.google.com/drive/folders/1z1UmReVqKtcFdb4hhNI2pK4qikJ_ZQsM
 */
public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device:" +
                "manufacturer:'" + manufacturer + '\'' +
                ", price:" + price +
                ", serialNumber:'" + serialNumber + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Float.compare(device.price, price) == 0 && Objects.equals(manufacturer, device.manufacturer) && Objects.equals(serialNumber, device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, serialNumber);
    }
}
