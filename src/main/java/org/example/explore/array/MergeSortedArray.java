package org.example.explore.array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,0,0,0};
        int[] b = {0,0,1};
        merge(a, 3, b, 3);
        System.out.println(Arrays.toString(a));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
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
    }
}
