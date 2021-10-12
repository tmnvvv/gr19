package ru.rudenko.task11_10.cat;

/*
 * @created 11/10/2021
 * @project Cat
 * @author Rudenko, Latushkin
 */

/*
 * ref: https://docs.google.com/document/d/1PymZPGVmXkfXIrJgvUJ-hogpxi1CW07lUOu1b2K8z08/edit
 */
public class Loader {
    private static Cat getKitten() {
        return new Cat(1.1, CatColor.RGB);
    }
}
