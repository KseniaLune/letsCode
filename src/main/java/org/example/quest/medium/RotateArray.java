package org.example.quest.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {
        if (k == 0) return;
        if (nums.length < 2) return;
        if (k == nums.length) return;

        k = k % nums.length;

        List<Integer> list = new ArrayList<>();
        int n = nums.length - k;
        while (n < nums.length) {
            list.add(nums[n]);
            n++;
        }
        for (int j = 0; j < nums.length - k; j++) {
            list.add(nums[j]);
        }
        for (int j = 0; j < nums.length; j++) {
            nums[j] = list.get(j);
        }
    }
}
