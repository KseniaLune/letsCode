package org.example.quest;

public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums, 9));
    }

    public static int search(int[] nums, int target) {
        int startIndex = 0, endIndex = nums.length-1, midIndex;

        while (startIndex<=endIndex){
            midIndex = startIndex+(endIndex-startIndex)/2;

            if(nums[midIndex]==target) {
                return midIndex;
            }
                if(nums[midIndex]<target){
                startIndex=midIndex+1;
            } else {
                endIndex = midIndex-1;
            }
        }
        return -1;
    }
}
