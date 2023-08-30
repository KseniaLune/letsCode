package org.example.quest.leetCode75.easy;


import java.util.*;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
        int[] arr = {4,2,1,1,2};
        System.out.println(kidsWithCandies(arr, 1));

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();

        int maxValue = 0;
        for (int candy: candies) {
            maxValue = Math.max(candy,maxValue);
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies < maxValue) {
                res.add(false);
            } else {
                res.add(true);
            }
        }
        return res;
    }
}
