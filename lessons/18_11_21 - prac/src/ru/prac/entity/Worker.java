package ru.prac.entity;

import lombok.Getter;

/*
 * @created 20.11.2021 - 15:23
 * @project 18_11_21 - prac
 * @author Polyakov Anton
 */

/**
 * Класс Worker
 */
@Getter
public class Worker {
    private String name;
    private String post;
    private String hireDate;

    /**
     * @param name имя работника с инициалами
     * @param post должность работника
     * @param hireDate дата принятия на работу работника
     */
    public Worker(String name, String post, String hireDate) {
        this.name = name;
        this.post = post;
        this.hireDate = hireDate;
    }

    /**
     * Метод для получения всей информации об объекте в виде String
     * @return String
     */
    public String getStringInformation(){
        return "WorkerName: " + name + ". WorkerPost: " + post + ". WorkerHireDate: " + hireDate;
    }
}