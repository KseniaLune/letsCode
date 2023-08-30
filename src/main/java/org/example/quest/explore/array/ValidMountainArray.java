package org.example.quest.explore.array;

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = {3, 7, 6, 4, 3, 0, 1, 0};
        int[] arr2 = {3, 5, 5};
        System.out.println(validMountainArray(arr));

    }

    public static boolean validMountainArray(int[] arr) {
        int length = arr.length;
        int i = 0;

        while (i + 1 < length && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == length - 1) {
            return false;
        }
        while (i + 1 < arr.length && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == arr.length - 1;
    }

}
