package ru.iveen.lessons.third;

import java.util.Arrays;

/*
 * @created 21.09.2021 - 10:23
 * @project lessons.3
 * @author Polyakov Anton
 */
public class Main {
 public static void main(String[] args) {
  CustomerArray customerArray = new CustomerArray();
  ReversedArray reversedArray = new ReversedArray();
  UserArray userArray = new UserArray();

  int array1[] = {2, 3, 5, 77};
  customerArray.get(array1);

  System.out.println("\nreversed array = " + Arrays.toString(reversedArray.myReverse(array1)));

  int array2[] = {2, 3, 5, 77, 101, 41};
  System.out.println("subArray = " + Arrays.toString(reversedArray.subArray(array2, 2, 3)));

  System.out.println("added element on 0 index - " + Arrays.toString(userArray.modifyArray(array2, 7)));
 }
}