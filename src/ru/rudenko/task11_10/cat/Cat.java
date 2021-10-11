package ru.rudenko.task11_10.cat;

/*
 * @created 11/10/2021
 * @project Cat
 * @author Rudenko
 */

/*
 * ref: https://docs.google.com/document/d/1PymZPGVmXkfXIrJgvUJ-hogpxi1CW07lUOu1b2K8z08/edit
 */
public class Cat {
    private double weight;
    private int meowCount;
    private boolean liveStatus;

    public Cat(double weight) {
        this.weight = weight;
        this.meowCount = 0;
        this.liveStatus = true;
    }

    public double getWeight() {
        return weight;
    }

    public boolean getLiveStatus() {
        return liveStatus;
    }

    public void feed(double foodWeight) {
        if (!liveStatus) {
            System.out.println("Кошка замяукана");
        } else {
            if (this.weight > 5) {
                System.out.println("Кошка перекормлена");
            }
            System.out.println(this.weight);
            this.weight += foodWeight;
        }
    }

    public void meow() {
        if (this.meowCount > 10) {
            this.liveStatus = false;
            System.out.println("Кошка замяукана");
        } else {
            this.meowCount++;
        }
    }
}
