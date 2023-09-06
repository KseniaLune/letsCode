package org.example.quest.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {
        int[] arr = {4,3,7,8,2,1,3,4};
        System.out.println(findDisappearedNumbers(arr));//{5,6}
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int position = nums[i] - 1; //correct position
            if (nums[i] != nums[position]) {
                int temp = nums[i];
                nums[i] = nums[position];
                nums[position] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                result.add(j+1);
            }
        }
        return result;
    }

    public static List<Integer> findDisappearedNumbersWithSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= nums.length; i++) {
            set.add(i);
        }
        for (int num : nums) {
            set.remove(num);
        }
        return set.stream().toList();
    }
}
