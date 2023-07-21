package org.example.explore.array;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
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
}
