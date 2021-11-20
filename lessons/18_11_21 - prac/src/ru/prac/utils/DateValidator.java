package ru.prac.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * @created 20.11.2021 - 16:17
 * @project 18_11_21 - prac
 * @author Polyakov Anton
 */
public class DateValidator {
    public void validate(String pattern, String date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        dateFormat.setLenient(false);
        dateFormat.parse(date);
    }
}
