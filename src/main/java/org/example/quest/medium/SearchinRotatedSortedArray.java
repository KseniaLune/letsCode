package org.example.quest.medium;

public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        /**
         * nums = [4,5,6,7,0,1,2], target = 0
         * output = 4
         */

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(arr, 0));

    }

    public static int search(int[] nums, int target) {
        int li = 0, ri = nums.length - 1;

        while (li < ri) {
            int mid = (li + ri) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[li] <= nums[mid]) {
                if (target >= nums[li] && target < nums[mid]) {
                    ri = mid - 1;
                } else {
                    li = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[ri]) {
                    li = mid +1;
                } else {
                    ri = mid - 1;
                }

            }
        }
        if (nums[li] == target) {
            return li;
        }

        return -1;
    }
}
