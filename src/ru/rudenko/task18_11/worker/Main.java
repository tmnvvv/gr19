package ru.rudenko.task18_11.worker;

/*
 * @created 18/11/2021
 * @project Worker
 * @author Rudenko
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String FORMAT = "dd-MM-yyyy";

        int i = 0;

        while (i < 5) {
            System.out.print("Input first name: ");
            String name = in.next();

            System.out.print("Input initials: ");
            String initials = in.next();

            System.out.print("Input job title: ");
            String jobTitle = in.next();

            System.out.print("Input year of employment (dd-mm-yyyy): ");
            String yearOfEmployment = in.next();

            try {
                dateValidate(FORMAT, yearOfEmployment);
            } catch (ParseException e) {
                System.out.println("Дата введена в неправильном формате. Попробуйте снова");
            }

            workers.add(new Worker(name, initials, jobTitle, yearOfEmployment));
            i++;
        }

        Collections.sort(workers);
    }

    public static void dateValidate(String format, String value) throws ParseException {
        DateFormat formatter = new SimpleDateFormat(format);
        formatter.setLenient(false);
        formatter.parse(value);
    }
}
