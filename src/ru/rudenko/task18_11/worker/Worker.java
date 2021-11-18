package ru.rudenko.task18_11.worker;

/*
 * @created 18/11/2021
 * @project Worker
 * @author Rudenko
 */

public class Worker implements Comparable<Worker> {
    private String name;
    private String initals;
    private String jobTitle;
    private String yearOfEmployment;

    public Worker(String name, String initals, String jobTitle, String yearOfEmployment) {
        this.name = name;
        this.initals = initals;
        this.jobTitle = jobTitle;
        this.yearOfEmployment =  yearOfEmployment;
    }

    public String getName() {
        return name;
    }

    public String getInitals() {
        return initals;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getYearOfEmployment() {
        return yearOfEmployment;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", initals='" + initals + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", yearOfEmployment=" + yearOfEmployment +
                '}';
    }

    @Override
    public int compareTo(Worker o) {
        return toString().compareTo(o.toString());
    }
}
