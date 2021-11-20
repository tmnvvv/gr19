package ru.iveen.firstlesson;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class FindNum {
    public int findNum(int[] nums, int requestNum) {
        int near = abs(nums[0]-requestNum);
        int numValue = 0;
        for (int i: nums){
            if (near > abs(i-requestNum)){
                near = abs(i-requestNum);
                numValue = i;
            }
            if (near == abs(i-requestNum)){
                numValue = max(numValue, i);
            }
        }
        return numValue;
    }
}