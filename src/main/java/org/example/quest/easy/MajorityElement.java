package org.example.quest.easy;

import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);
            }

        }
        Set<Integer> integers = map.keySet();
        int maxValue = map.get(nums[0]);
        int maxKey = nums[0];
        for (int i:integers){
            if(maxValue<map.get(i)){
                maxValue = map.get(i);
                maxKey = i;
            }
        }
       return maxKey;
    }
}
