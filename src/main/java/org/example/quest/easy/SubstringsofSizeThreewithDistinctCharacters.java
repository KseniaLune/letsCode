package org.example.quest.easy;

import java.util.HashSet;
import java.util.Set;

public class SubstringsofSizeThreewithDistinctCharacters {
    public static void main(String[] args) {
        String s = "aababcabc";
        System.out.println(countGoodSubstrings(s));

    }
    public static int countGoodSubstrings(String s) {
        if (s.length() < 3) {
            return 0;
        }
        int res = 0;

        int left = 0;
        int middle = 1;
        int right = 2;

        while (right < s.length()) {
            if (s.charAt(left) != s.charAt(middle) &&
                s.charAt(left) != s.charAt(right) &&
                s.charAt(middle) != s.charAt(right)) {
                res++;
            }
            left++;
            middle++;
            right++;
        }
        return res;
    }
}
