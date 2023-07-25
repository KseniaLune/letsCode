package org.example.explore.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,4,5,5};
        System.out.println(RemoveDuplicates(arr));

    }
    public static int removeDuplicatesBest(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        Object[] objects = set.toArray();

        for (int i = 0; i < objects.length; i++) {
            nums[i] =(int) objects[i];
        }
        return objects.length;
    }
    public static int RemoveDuplicates(int[] nums) {

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[index]==nums[i]){
                continue;
            }
            index++;
            nums[index] = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        return index+1;
    }
}
