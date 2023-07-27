package org.example.explore.array;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(thirdMax(arr));

    }
    public static int thirdMax(int[] nums) {
        if (nums.length<2)return nums[1];

        Arrays.sort(nums);
        int count = 1;
        for (int i = nums.length-2; i >=0; i--) {
            if(nums[i]==nums[i+1]){
                continue;
            } else {
                count++;
            }
            if (count==3){
               return nums[i];
            }
        }
        return nums[nums.length-1];

//        int one = 0, two = 0, three = 0;

    }
}
