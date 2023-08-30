package org.example.quest.easy;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,0};
        int[] arr2 = {5,1,2,7,3,6,8,0};

        System.out.println(missingNumber2n(arr2));
    }

    public static int missingNumberN(int[] nums) {
        //arithmetic sequence
        int arithmeticSum = (nums.length * (nums.length + 1)) / 2;

        int sumNums = 0;
        for (int num : nums) {
            sumNums += num;
        }

        return arithmeticSum - sumNums;
    }

    public static int missingNumber2n(int[] nums) {
        int[] arr = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return i;
            }
        }
        return 0;
    }

    public static int missingNumber3n(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < nums.length+1; i++) {
            set.add(i);
        }
        for (int num : nums) {
            set.remove(num);

        }
        for (Integer i : set) {
            return i;
        }
        return 0;
    }
}
