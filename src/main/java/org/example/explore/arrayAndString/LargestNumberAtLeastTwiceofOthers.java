package org.example.explore.arrayAndString;

public class LargestNumberAtLeastTwiceofOthers {
    public static void main(String[] args) {
        int[] arr = {0,0,3,2};
        System.out.println(dominantIndex(arr));
    }
    public static int dominantIndex(int[] nums) {
        int max = 0,indexMax = 0, secondMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                secondMax = max;
                max = nums[i];
                indexMax = i;
            } else if(nums[i]>secondMax){
                secondMax = nums[i];
            }
        }
        if (max>=secondMax*2){
            return indexMax;
        } else{
            return -1;
        }
    }
}
