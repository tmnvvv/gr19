package ru.iveen.firstlesson;

public class Main {
    public static void main(String[] args){
        FindNum findnum = new FindNum();
        FindNumStream findNumStream = new FindNumStream();

        int[] nums = {101, 4, 9, 11, 14, 14};
        System.out.println(findnum.findNum(nums, 10));
        findNumStream.findNum(nums, 10);
    }
}