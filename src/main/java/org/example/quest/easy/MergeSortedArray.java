package org.example.quest.easy;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        int m = 0;
        int n = 1;

        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            for (int i = 0; i < nums1.length ; i++) {
                nums1[i] = nums2[i];
            }
        }
       if (n!=0){
           for (int i = nums1.length-1, j=nums2.length-1; i >0&&j>=0; i--, j--) {
               nums1[i]= nums2[j];
           }
           for (int i = 0; i < nums1.length; i++) {
               for (int j = 0; j < nums1.length; j++) {
                   if(nums1[j]>nums1[i]){
                       int temp = nums1[i];
                       nums1[i]=nums1[j];
                       nums1[j] = temp;
                   }
               }
           }
       }
       return nums1;
    }
}
