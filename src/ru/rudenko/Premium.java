package ru.rudenko;

public class Premium {
    public static void calculateThePremium(int seniority, int salary) {
        if (seniority < 5) {
            System.out.println(salary * 10 / 100);
        } else if (seniority >= 5 && seniority < 10) {
            System.out.println(salary * 15 / 100);
        } else if (seniority >= 10 && seniority < 15) {
            System.out.println(salary * 25 / 100);
        } else if (seniority >= 15 && seniority < 20) {
            System.out.println(salary * 35 / 100);
        } else if (seniority >= 20 && seniority < 25) {
            System.out.println(salary * 45 / 100);
        } else if (seniority >= 25) {
            System.out.println(salary * 50 / 100);
        }
    }
}
