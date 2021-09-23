/*
 * @created 21/09/2021
 * @project ArrayTasks
 * @author Rudenko, Latushkin
 */

package ru.iroqquois;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arrayOfNumbers = new Integer[10];

        // Задание 1
        CustomerArray customerArray = new CustomerArray(10, arrayOfNumbers);
        customerArray.maxValueOfArray();
        customerArray.minValueOfArray();
        customerArray.sumValueOfArray();
        customerArray.averageValuesOfArray();
        customerArray.oddValueOfArray();

        // Задание 2
        fillArrayByRandomValues(arrayOfNumbers);
        ReversedArray.myReverse(arrayOfNumbers);
        ReversedArray.subArray(fillArrayByRandomValues(arrayOfNumbers), 5, 10);

        // Задание 3
        System.out.println(Arrays.toString(UserArray.expandArray(arrayOfNumbers)));
        System.out.println(Arrays.toString(UserArray.insertArray(arrayOfNumbers, 10)));
    }
    static class CustomerArray {
        private final Integer nums;
        private final Integer[] arrayOfNumbers;

        public CustomerArray(Integer nums, Integer[] arrayOfNumbers) {
            this.nums = nums;
            this.arrayOfNumbers = fillArrayByRandomValues(arrayOfNumbers);
        }
        public void maxValueOfArray() {
            Integer maxValue = null;
            for (Integer i = 0; i < this.arrayOfNumbers.length; i++) {
                if (i == 0) {
                    maxValue = i;
                    continue;
                }
                if (this.arrayOfNumbers[i] > maxValue) {
                    maxValue = this.arrayOfNumbers[i];
                }
            }
            System.out.println(Arrays.toString(this.arrayOfNumbers));
            System.out.println(maxValue);
        }
        public void minValueOfArray() {
            Integer minValue = null;
            for (Integer i = 0; i < this.arrayOfNumbers.length; i++) {
                if (i == 0) {
                    minValue = i;
                    continue;
                }
                if (this.arrayOfNumbers[i] > minValue) {
                    minValue = this.arrayOfNumbers[i];
                }
            }
            System.out.println(Arrays.toString(this.arrayOfNumbers));
            System.out.println(minValue);
        }
        public void sumValueOfArray() {
            Integer sum = 0;
            for (Integer number : this.arrayOfNumbers) {
                sum += number;
            }
            System.out.println(Arrays.toString(this.arrayOfNumbers));
            System.out.println(sum);
        }
        public void averageValuesOfArray() {
            Integer sum = 0;
            for (Integer number : this.arrayOfNumbers) {
                sum += number;
            }
            Integer avg = Math.round(sum / this.arrayOfNumbers.length);
            System.out.println(Arrays.toString(this.arrayOfNumbers));
            System.out.println(avg);
        }
        public void oddValueOfArray() {
            for (Integer number : this.arrayOfNumbers) {
                if (number % 2 != 0) {
                    System.out.println(number);
                }
            }
        }
    }
    public static class ReversedArray {
        public static void myReverse(Integer[] array) {
            for (Integer i = 0; i < array.length / 2; i++) {
                Integer num = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = num;
            }
        }

        public static void subArray(Integer[] array, Integer index, Integer count) {
            Integer[] newArray = new Integer[count];
            Integer newArrayCount = 0;
            Integer lastIndexOfArray = array.length - 1;

            if (lastIndexOfArray - index < count) {
                count = count - array.length;

                for (Integer i = index; i <= lastIndexOfArray; i++) {
                    newArray[newArrayCount] = array[i];
                    newArrayCount++;
                }

                for (Integer i = 0; i <= lastIndexOfArray + count - index; i++) {
                    newArray[newArrayCount] = 1;
                    newArrayCount++;
                }
            } else {
                for (Integer i = index; i < count + index; i++) {
                    newArray[newArrayCount] = array[i];
                    newArrayCount++;
                }
            }
            System.out.println(Arrays.toString(newArray));
        }
    }

    public static class UserArray {
        public static Integer[] expandArray(Integer[] array) {
            Integer[] copyOfArray = array;
            array = new Integer[array.length + 1];

            for (int i = 0; i < copyOfArray.length; i++) {
                array[i] = copyOfArray[i];
            }

            return array;
        }

        public static Integer[] insertArray(Integer[] array, Integer value) {
            Integer[] copyOfArray = array;
            array = new Integer[array.length + 1];
            System.arraycopy(copyOfArray, 0, array, 1, array.length - 1);
            array[0] = value;

            return array;
        }
    }

    public static Integer[] fillArrayByRandomValues (Integer[] array) {
        for (Integer i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 15);
        }

        return array;
    }
}