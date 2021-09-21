package ru.iveen.secondlesson;
/*
 * @created 09.09.2021
 * @author Polyakov Anton
*/

import ru.iveen.secondlesson.entity.Employee;
import ru.iveen.secondlesson.service.EmployeeService;
import ru.iveen.secondlesson.storage.EmployeeStorage;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        System.out.println("Задача №1: " + PowerOfTwo.powerOfTwo(2));
        System.out.println("Задача №2: " + DeMorganComparison.comparison(true, true));
        System.out.println("Задача №4: " + Parity.parity(1242));
        System.out.println("Задача №5: " + LogicOperations.operation(5, 10, 15));

        // Задача №6
        // Создание сотрудников
        Employee employee1 = employeeService.createEmployee("Антон", "Поляков", "15.05.2015", 5000);
        Employee employee2 = employeeService.createEmployee("Алексей", "Петухов", "15.05.1980", 5000);
        Employee employee3 = employeeService.createEmployee("Сергей", "Питонистов", "15.05.2000", 5000);
        Employee employee4 = employeeService.createEmployee("Анатолий", "Джавистов", "15.05.2010", 5000);
        Employee employee5 = employeeService.createEmployee("Владимир", "Пхпешеров", "15.05.2020", 5000);

        // Процесс выдачи зарплаты с учетом премии
        Premium.premiumProcess(EmployeeStorage.getEmployees());
    }
}