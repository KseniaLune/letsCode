package org.example.explore.array;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {1,0,1};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        if (nums.length<2)return;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[index]==0){
                if (nums[i]==0){
                    continue;
                } else {
                    nums[index] = nums[i];
                    nums[i] = 0;
                    index++;
                }
            } else {
                index++;
            }
        }
    }
}
