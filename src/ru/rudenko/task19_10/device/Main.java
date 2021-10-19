package ru.rudenko.task19_10.device;

/*
 * @created 19/10/2021
 * @project Device
 * @author Rudenko, Latushkin
 */

/**
 * ref: https://drive.google.com/drive/folders/1z1UmReVqKtcFdb4hhNI2pK4qikJ_ZQsM
 */
public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("HP", 20000, "1245125", 1920, 1080);
        EthernetAdapter ethernetAdapter = new EthernetAdapter(
                "HP",
                20000,
                "1245856885",
                300,
                "24:D:23:A"
        );
        System.out.println(monitor.equals(ethernetAdapter));
        System.out.println(monitor.hashCode());
        System.out.println(ethernetAdapter.hashCode());
        System.out.println(monitor.toString());
        System.out.println(ethernetAdapter.toString());
    }
}
