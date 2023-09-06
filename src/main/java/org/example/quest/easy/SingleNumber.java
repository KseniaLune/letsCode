package org.example.quest.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(singleNumberXOR(arr)); //4
    }


    public static int singleNumberXOR(int[] nums) {
       int mask = 0;
        for (int num : nums) {
            mask ^= num;
        }
        return mask;
    }

    public static int singleNumber(int[] nums) {
       Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        return set.stream().toList().get(0);
    }
}
