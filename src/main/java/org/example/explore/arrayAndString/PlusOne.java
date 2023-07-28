package org.example.explore.arrayAndString;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(arr)));

    }
    public static int[] plusOne(int[] digits) { //Узкое место - длина long
        String s = "";
        for (int i : digits) {
            s+=i;
        }
        System.out.println(s);
        Long digit = Long.parseLong(s);
        digit+=1;
        s = digit+"";
        System.out.println(s);
        char[] charArray = s.toCharArray();
        int[] res = new int[charArray.length];
        System.out.println(Arrays.toString(charArray));

        for (int i = 0; i <res.length; i++) {
            res[i] = Character.getNumericValue(charArray[i]);
        }
        return res;
    }

    public static int[] plusOneBest(int[] digits) {
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
