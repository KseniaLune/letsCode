package org.example.quest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {-3,-1,0,0,0,3,3};
//        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(bestRemoveDuplicates(nums)));
//        System.out.println(removeDuplicates(nums));
    }

    public static int[] removeDuplicates(int[] nums) {
        Set<Integer>set = new TreeSet<>();
        for (int num:nums){
            set.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]=0;
        }
        Object[] res = set.toArray();
        System.out.println(Arrays.toString(res));
        for (int i = 0; i < res.length; i++) {
            nums[i] = (int) res[i];
        }
        return nums;
    }

    public static int [] bestRemoveDuplicates(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return arr;

    }

}
