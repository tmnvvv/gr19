package ru.iveen.secondlesson.service;

import ru.iveen.secondlesson.entity.Employee;
import ru.iveen.secondlesson.storage.EmployeeStorage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeService {
    /**
     * Метод создания сотрудника.
     * @param firstName - имя сотрудника.
     * @param lastName - фамилия сотрудника.
     * @param receiptDate - дата (день, месяц, год) приёма сотрудника на работу.
     * @param salary - зарплата сотрудника.
     *
     * @variable formatter - паттерн для форматирования даты.
     * @variable date - перевод даты из "String" в "LocalDate".
     * @variable employee - объект класса Employee (сотрудник).
     */
    public Employee createEmployee(String firstName, String lastName, String receiptDate, int salary){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = LocalDate.parse(receiptDate, formatter);
        Employee employee = new Employee(EmployeeStorage.getId(), firstName, lastName, date, salary);
        return EmployeeStorage.addEmployee(employee);
    }
}