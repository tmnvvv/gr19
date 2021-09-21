package ru.iveen.calculatorapp;

/*
 * @created 16.09.2021 - 22:36
 * @project calculatorApp
 * @author Polyakov Anton
 */
public class Calculator {
    public int sumOf(int n1, int n2) {
        return n1+n2;
    }

    public double sumOf(double n1, double n2) {
        return n1+n2;
    }

    public int sumOf(int[] nums) {
        int out = 0;
        for (int num: nums) {
            out += num;
        }
        return out;
    }

    public double sumOf(double[] nums) {
        double out = 0;
        for (double num: nums) {
            out += num;
        }
        return out;
    }


    public int substractionOf(int n1, int n2) {
        return n1-n2;
    }

    public double substractionOf(double n1, double n2) {
        return n1-n2;
    }

    public int substractionOf(int[] nums) {
        int out = nums[0];
        for (int i=1; i<nums.length; i++) {
            out -= nums[i];
        }
        return out;
    }

    public double substractionOf(double[] nums) {
        double out = nums[0];
        for (int i=1; i<nums.length; i++) {
            out -= nums[i];
        }
        return out;
    }


    public int multiplyOf(int n1, int n2) {
        return n1*n2;
    }

    public double multiplyOf(double n1, double n2) {
        return n1*n2;
    }

    public int multiplyOf(int[] nums) {
        int out = nums[0];
        for (int i=1; i<nums.length; i++) {
            out *= nums[i];
        }
        return out;
    }

    public double multiplyOf(double[] nums) {
        double out = nums[0];
        for (int i=1; i<nums.length; i++) {
            out *= nums[i];
        }
        return out;
    }


    public double divisionOf(int n1, int n2) {
        return n1/n2;
    }

    public double divisionOf(double n1, double n2) {
        return n1/n2;
    }

    public double divisionOf(int[] nums) {
        double out = nums[0];
        for (int i=1; i<nums.length; i++) {
            out /= nums[i];
        }
        return out;
    }

    public double divisionOf(double[] nums) {
        double out = nums[0];
        for (int i=1; i<nums.length; i++) {
            out /= nums[i];
        }
        return out;
    }


    public int power(int n, int power) {
        int out = n;
        for (int i=0; i<power-1; i++) {
            out *= n;
        }
        return out;
    }

    public double power(double n, double power) {
        double out = n;
        for (int i=0; i<power-1; i++) {
            out *= n;
        }
        return out;
    }
}