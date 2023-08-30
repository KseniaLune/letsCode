package org.example.quest.leetCode75.medium;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(increasingTriplet(arr));

    }

    public static boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        Integer num1 = nums[0];
        Integer num2 = null;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= num1) {
                num1 = nums[i];
            } else {
                if (num2 != null && nums[i] > num2){
                    return true;
                }
                num2 = nums[i];
            }
        }
        return false;

    }
}
