package org.example.quest.explore.arrayAndString;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr = {2,1,-1};
        System.out.println(pivotIndex(arr));
    }

    public static int pivotIndex(int[] nums) {
        if (nums.length<1)return -1;

        int leftSum = 0, rightSum = 0;
        for (int i : nums) {
            rightSum += i;
        }
        System.out.println(rightSum+"\n-----------");
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (rightSum==leftSum) return i;
            leftSum +=nums[i];
            System.out.println(leftSum);
        }
        return -1;
    }
}
