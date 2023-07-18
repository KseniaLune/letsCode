package org.example.quest.easy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        var d = new int[]{9,9};
        System.out.println(Arrays.toString(plusOne(d)));
    }

    public static int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];
        for (int i = digits.length - 1; i >= 0; i--) {
            int c = digits[i] + 1;
            if (c < 10) {
                digits[i]++;
                return digits;
            } else if (i != 0) {
                digits[i] = (digits[i] + 1) % 10;
                digits[i - 1] = digits[i - 1]++;
            } else {
                digits[i] = (digits[i] + 1) % 10;
                result[i] = 1;
                for (int j = 0; j < digits.length; j++) {
                    result[j + 1] = digits[j];
                }
                return result;
            }

        }

        return digits;
    }
}
