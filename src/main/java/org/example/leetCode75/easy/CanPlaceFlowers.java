package org.example.leetCode75.easy;

import java.util.Arrays;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 1};

        System.out.println(canPlaceFlowers(arr, 1));

    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        if (flowerbed.length == 1) {
            return flowerbed[0] == 0 && n <= 1;
        }

        int index = 0;
        int count = 0;

        while (index < flowerbed.length) {
            if (flowerbed[index] == 0) {
                if (index - 1 >= 0 && index + 1 < flowerbed.length) {
                    if (flowerbed[index - 1] == 0 && flowerbed[index + 1] == 0) {
                        flowerbed[index] = 1;
                        count++;
                    }
                } else if (index - 1 >= 0) {
                    if (flowerbed[index - 1] == 0) {
                        flowerbed[index] = 1;
                        count++;
                    }
                } else {
                    if (flowerbed[index + 1] == 0) {
                        flowerbed[index] = 1;
                        count++;
                    }
                }
            }
            index++;
        }
        return n <= count;

    }
}
