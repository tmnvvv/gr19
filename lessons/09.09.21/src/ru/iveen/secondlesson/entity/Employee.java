package ru.iveen.secondlesson.entity;

import java.time.LocalDate;

/**
 * Класс сотрудника компании.
 * @variable id - ID сотрудника.
 * @variable receiptDate - дата приёма сотрудника на работу.
 * @variable firstName - имя сотрудника.
 * @variable lastName - фамилия сотрудника.
 * @variable salary - зарплата сотрудника.
 */
public class Employee {
    private final int id;
    private final LocalDate receiptDate;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, LocalDate receiptDate, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.receiptDate = receiptDate;
        this.salary = salary;
    }

    public int getId(){ return id; }

    public String getFirstName() { return this.firstName; }

    public String getLastName() { return this.lastName; }

    public LocalDate getReceiptDate() { return this.receiptDate; }

    public int getSalary() { return this.salary; }

    public void setFirstName(String name){ this.firstName = name; }

    public void setLastName(String name){ this.lastName = name; }

    public void setSalary(int salary) { this.salary = salary; }
}
