package org.example.quest.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSumMySolution(nums, target)));
    }

    public static int[] twoSumMySolution(int[] nums, int target) {
        int[] result = new int[]{};
        for (int i = 0, j = i + 1; i < nums.length && j < nums.length; ) {

            if (nums[i] + nums[j] == target) {
                result = new int[]{i, j};
                break;

            }else if (j==nums.length-1){
                i++;
                j=(i+1);
            }else {
                j++;
            }
        }
        return result;
    }
    public static int[] twoSumBestSolution(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }
}



