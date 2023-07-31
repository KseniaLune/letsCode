package org.example.quest.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        int m = 0;
        int n = 1;

        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
    }
    public static List<Integer> mergeTwoSortedList(List<Integer> ar1, List<Integer> ar2) {
        if (ar1.isEmpty()) {
            return ar2;
        } else if (ar2.isEmpty()) {
            return ar1;
        }

        List<Integer> res = new ArrayList<>(ar1.size() + ar2.size()); // 2N -> N

        int leftInd = 0;
        int rightInd = 0;

        while (leftInd < ar1.size() || rightInd < ar2.size()) {
            if (leftInd < ar1.size() && rightInd < ar2.size()) {
                if (ar1.get(leftInd) < ar2.get(rightInd)) {
                    res.add(ar1.get(leftInd));
                    leftInd++;
                } else {
                    res.add(ar2.get(rightInd));
                    rightInd++;
                }
            } else if (leftInd < ar1.size()) {
                res.add(ar1.get(leftInd));
                leftInd++;
            } else if (rightInd < ar2.size()) {
                res.add(ar2.get(rightInd));
                rightInd++;
            }
        }

        return res;
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
