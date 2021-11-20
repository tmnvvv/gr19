package ru.iveen.secondlesson.storage;

import ru.iveen.secondlesson.entity.Employee;
import java.util.HashSet;

/**
 * Класс хранилища сотрудников.
 * @variable employees - HashSet из сотрудников компании.
 */
public class EmployeeStorage {
    private final static HashSet<Employee> employees = new HashSet<>();

    // Добавление сотрудника в HashSet "employees".
    public static Employee addEmployee(Employee employee){
        employees.add(employee);
        System.out.println(String.format("Сотрудник с ID %1$d создан\n", employee.getId()));
        return employee;
    }

    // Метод для генерации ID новых сотрудников.
    public static Integer getId(){
        return employees.size()+1;
    }

    // Метод удаления сотрудника по его ID из HashSet "employees".
    public static Boolean removeEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                return true;
            }
        }
        return false;
    }

    // Метод для получения HashSet "employees".
    public static HashSet<Employee> getEmployees(){
        return employees;
    }
}