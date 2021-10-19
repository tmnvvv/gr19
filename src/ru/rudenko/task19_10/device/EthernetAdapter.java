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
public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return super.toString() + " EthernetAdapter: " +
                "speed:" + speed +
                ", mac:'" + mac + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return speed == that.speed && Objects.equals(mac, that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, mac);
    }
}
