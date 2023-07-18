package org.example.quest.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String result;
        for (int i = 0, j=1; i < strs.length&&j<strs.length; i++, j++) {
            char[] string1 = strs[i].toCharArray();
            char[] string2 = strs[j].toCharArray();

            for (int k = 0;; k++) {

            }

        }
        return null;
    }
}
