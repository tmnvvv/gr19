package ru.iveen.lessons.third;

/*
 * @created 21.09.2021 - 10:24
 * @project lessons.3
 * @author Polyakov Anton
 */
import java.util.Arrays;

public class CustomerArray {
 public void get(int[] arg) {
  int max = Arrays.stream(arg).max().getAsInt();
  int min = Arrays.stream(arg).min().getAsInt();
  int sum = Arrays.stream(arg).sum();
  int avg = (int) Arrays.stream(arg).average().getAsDouble();
  System.out.println("max value = " + max);
  System.out.println("min value = " + min);
  System.out.println("sum of = " + sum);
  System.out.println("avg value ≈ " + avg);
  System.out.println("\nВывод нечётных чисел:");
  Arrays.stream(arg).filter(x -> x%2 == 1).forEach(x -> System.out.println(x));
 }
}