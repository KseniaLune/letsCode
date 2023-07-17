package org.example.quest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RunningSumOfFirstdArray {
    public static void main(String[] args) {
        int [] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        if (nums.length<2){
            return nums;
        }

        int [] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i <nums.length; i++) {
            sum+=nums[i];
            result[i] = sum;
        }
        return result;
    }
}
