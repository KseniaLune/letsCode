package org.example.top150;


public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[index] == nums[i]) {
                continue;
            }
            index++;
            nums[index] = nums[i];
        }

        return index + 1;
    }
}
