package org.example.quest.explore.array;

import java.util.Arrays;
import java.util.Collections;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] nums = {
            -4, -1, 0, 3, 10
        };
        System.out.println(Arrays.toString(sortedSquaresMySol(nums)));
    }

    public static int[] sortedSquaresMySol(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        return nums;
    }

    public static int[] sortedSquares(int[] nums) {
        //result array
        int[] res = new int[nums.length];
        //pointers for left and right
        int lo = 0;
        int hi = nums.length - 1;
        //iterate from n to 0
        for (int i = nums.length - 1; i >= 0; i--) {
            //check if abs left is less than or equal to abs right
            if (Math.abs(nums[lo]) >= Math.abs(nums[hi])) {
                //add left squared to result array
                res[i] = nums[lo] * nums[lo];
                //increment left pointer
                lo++;
            } else {
                //add right squared to result array
                res[i] = nums[hi] * nums[hi];
                //decrement right pointer
                hi--;
            }
        }
        return res;
    }
}
