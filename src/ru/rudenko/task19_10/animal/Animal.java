package ru.rudenko.task19_10.animal;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private boolean tail;


    @Override
    public String toString() {
        return "Имя: " + name + '\'' +
                ", возраст:" + age +
                ", ХВОСТ: " + (tail ? "имеется" : "отсутствует");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tail == animal.tail && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }
}
