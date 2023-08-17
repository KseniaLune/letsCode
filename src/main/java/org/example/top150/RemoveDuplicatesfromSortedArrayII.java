package org.example.top150;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArrayII {
    public static void main(String[] args) {
        /**
         *  {1,1,2,2,1,2,2,3,3,3..} -> {1,1,2,2,3,3...}
         */

        int[] arr = {1,1,1,2,2,3,3,3,4};
        System.out.println(removeDuplicates(arr));

    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {

            if (i < 2 || nums[j] > nums[i - 2]){
                nums[i++] = nums[j];
            }
        }
        System.out.println(Arrays.toString(nums));
        return i;
    }

}
