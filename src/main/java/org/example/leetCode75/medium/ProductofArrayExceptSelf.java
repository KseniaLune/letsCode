package org.example.leetCode75.medium;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        //[24,12,8,6]
        System.out.println(Arrays.toString(productExceptSelfWithDivision(arr)));
    }


    public static int[] productExceptSelfWithDivision(int[] nums) {
        int[] res = new int[nums.length];
        int prod = 1;
        boolean nullEx = false;
        for (int num : nums) {
            if (num != 0) {
                prod *= num;
            } else {
                nullEx = true;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nullEx) {
                if (nums[i] == 0) {
                    res[i] = prod;
                } else {
                    res[i] = 0;
                }
            } else {
                res[i] = prod / nums[i];
            }
        }
        return res;
    }
}
