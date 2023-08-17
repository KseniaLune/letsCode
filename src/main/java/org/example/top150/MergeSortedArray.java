package org.example.top150;

import java.util.*;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        merge(arr1, 3, arr2, 3);
        System.out.println(Arrays.toString(arr1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            for (int i = 0; i < nums1.length; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }

        List<Integer> res = new ArrayList<>();
        int indexOne = 0;
        int indexTwo = 0;

        while (m > 0 || n > 0) {
            if (m > 0 && n > 0) {
                if (nums1[indexOne] <= nums2[indexTwo]) {
                    res.add(nums1[indexOne]);
                    indexOne++;
                    m--;
                } else {
                    res.add(nums2[indexTwo]);
                    indexTwo++;
                    n--;
                }
            } else if (m > 0) {
                res.add(nums1[indexOne]);
                indexOne++;
                m--;
            } else {
                res.add(nums2[indexTwo]);
                indexTwo++;
                n--;
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = res.get(i);
        }

    }
}
