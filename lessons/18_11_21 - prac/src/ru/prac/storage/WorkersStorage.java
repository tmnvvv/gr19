package ru.prac.storage;

import lombok.Getter;
import ru.prac.entity.Worker;

import java.util.ArrayList;
import java.util.Collections;

/*
 * @created 20.11.2021 - 16:35
 * @project 18_11_21 - prac
 * @author Polyakov Anton
 */

/**
 * Хранилище Worker
 */
@Getter
public class WorkersStorage {
    private ArrayList<Worker> storage;

    public WorkersStorage() {
        this.storage = new ArrayList<>();
    }

    /**
     * @param name имя работника с инициалами
     * @param post должность работника
     * @param hireDate дата принятия на работу работника
     */
    public void addToStorage(String name, String post, String hireDate){
        storage.add(new Worker(name, post, hireDate));
    }

    /**
     * Метод для получения данных из хранилища, отсортированных по имени работников
     * @return отсортированное по имени работников хранилище Worker в виде ArrayList<Worker>
     */
    public ArrayList<Worker> getSortedByWorkerNameStorage(){
        ArrayList<Worker> tempArray = new ArrayList<>(storage);
        Collections.sort(tempArray, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        return tempArray;
    }
}