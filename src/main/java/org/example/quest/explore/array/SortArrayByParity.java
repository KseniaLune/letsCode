package org.example.quest.explore.array;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr = {0,1};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        if (nums.length<2)return nums;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[index] % 2 == 0) {
                index++;
            } else {
                if (nums[i] % 2 != 0) {
                    continue;
                } else {
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;

                    index++;
                }
            }
        }
        return nums;
    }
}
