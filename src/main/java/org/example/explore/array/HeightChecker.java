package org.example.explore.array;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] arr = {2,1,2,1,1,2,2,1};
        //{}
        System.out.println(heightCheckerSecond(arr));
    }
    public static int heightCheckerSecond(int[] heights) {
        if (heights.length < 2) return 0;

        int[] counter = Arrays.copyOf(heights, heights.length);
        int res = 0;
        Arrays.sort(counter);
        for (int i = 0; i < heights.length; i++) {
            if (counter[i]!=heights[i]) res++;
        }
        return res;

    }

    public static int heightChecker(int[] heights) {
        if (heights.length < 2) return 0;
        int[] counter = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            int min = heights[i], minIndex = i;

            for (int j = i + 1; j < heights.length; j++) {
                if (heights[j] < min) {
                    min = heights[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = heights[i];
                heights[i] = heights[minIndex];
                heights[minIndex] = temp;

                counter[i]++;
                counter[minIndex]++;
            }

        }
        int res = 0;

        for (int a : counter) {
            if (a != 0) {
                res++;
            }
        }
        System.out.println(Arrays.toString(heights));
        return res;
    }
}
