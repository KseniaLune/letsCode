package org.example.quest.easy;

import java.util.*;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "bbab";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) set.remove(c);
            else set.add(c);
        }

        int odd = set.size();
        return s.length() - (odd == 0 ? 0 : odd - 1);

    }
}
