package org.example.explore.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>res = new ArrayList<>();

        int[] counter = new int[nums.length];
        for (int i : nums) {
            counter[i-1]++;
        }
        for (int i = 0; i < counter.length; i++) {
            if(counter[i]==0){
                res.add(i+1);
            }
        }
        return res;

    }
}
