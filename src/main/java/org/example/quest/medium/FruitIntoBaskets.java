package org.example.quest.medium;

import java.util.*;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = {1,2,1};
        System.out.println(totalFruit(fruits));

    }
    public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> count = new HashMap<>();
        int res = 0, left = 0;
        for (int right = 0; right < fruits.length; ++right) {
            count.put(fruits[right], count.getOrDefault(fruits[right], 0) + 1);
            while (count.size() > 2) {
                count.put(fruits[left], count.get(fruits[left]) - 1);
                if (count.get(fruits[left]) == 0) count.remove(fruits[left]);
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;


    }
}
