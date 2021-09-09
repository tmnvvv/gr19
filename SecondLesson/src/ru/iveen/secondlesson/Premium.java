package ru.iveen.secondlesson;

import ru.iveen.secondlesson.entity.Employee;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;

public class Premium {
    /**
     * @param employees - HashSet из сотрудников компании.
     * @variable elapsedYears - расчёт времени нахождения сотрудника в компании.
     * @variable premiumPercent - процент премии сотрудника.
     * @variable employeeSalary - зарплата сотрудника без премии.
     * @variable employeePremium - размер премии сотрудника.
     */
    public static void premiumProcess(HashSet<Employee> employees){
        LocalDate currentDate = LocalDate.now(); // Текущая дата

        for (Employee employee : employees){
            long elapsedYears = ChronoUnit.YEARS.between(employee.getReceiptDate(), currentDate);
            int premiumPercent = 0; // Процент премии

            if (elapsedYears >= 25) {
                premiumPercent = 50;
            } else if (elapsedYears >= 20 & elapsedYears < 25) {
                premiumPercent = 45;
            } else if (elapsedYears >= 15 & elapsedYears < 20) {
                premiumPercent = 35;
            } else if (elapsedYears >= 10 & elapsedYears < 15) {
                premiumPercent = 25;
            } else if (elapsedYears >= 5 & elapsedYears < 10) {
                premiumPercent = 15;
            } else if (elapsedYears < 5) {
                premiumPercent = 10;
            }

            int employeeSalary = employee.getSalary();
            int employeePremium = premiumCalculation(employee.getSalary(), premiumPercent); // Размер премии сотрудника

            System.out.println(String.format("Сотрудник %1$s %2$s в компании уже %3$d лет и получает %4$d",
                    employee.getFirstName(),
                    employee.getLastName(),
                    elapsedYears,
                    premiumPercent) + "% премии.\nОклад: " + String.format("%1$d\nПремия: %2$d\nИтого: %3$d\n",
                    employeeSalary,
                    employeePremium,
                    employeeSalary + employeePremium ));
        }
    }
    // Метод расчёта премии
    public static int premiumCalculation(int salary, int percent) {
        return (salary/100*percent);
    }
}