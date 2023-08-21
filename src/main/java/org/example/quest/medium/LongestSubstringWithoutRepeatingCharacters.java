package org.example.quest.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcb";
        System.out.println(lengthOfLongestSubstring(s));

    }
    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int maxSubstring = 0;
        int lptr = 0;
        Set<Character> unique = new HashSet<>();

        for (int rptr = 0; rptr < s.length(); rptr++) {
            while (unique.contains(s.charAt(rptr))) {
                unique.remove(s.charAt(lptr));
                lptr++;
            }
            unique.add(s.charAt(rptr));
            maxSubstring = Math.max(maxSubstring, rptr-lptr+1);
        }

        return maxSubstring;
    }
}
