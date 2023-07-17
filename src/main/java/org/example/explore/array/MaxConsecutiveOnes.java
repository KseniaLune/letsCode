package org.example.explore.array;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int [] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxOnesCurrent = 0, maxOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1){
                maxOnesCurrent++;
            }
            if (nums[i]==0||i== nums.length-1){
                if(maxOnesCurrent>maxOnes){
                    maxOnes=maxOnesCurrent;
                }
                maxOnesCurrent=0;
            }
        }
        return maxOnes;
    }
}
