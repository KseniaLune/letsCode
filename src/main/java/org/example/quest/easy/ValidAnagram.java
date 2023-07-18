package org.example.quest.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "ab";
        String t = "a";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();

        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();

        for (char c : charsS) {
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (char c : charsT) {
            if (map.containsKey(c)) {
                if (map.get(c) == 0) {
                    return false;
                }
                int i = map.get(c);
                map.replace(c, map.get(c) - 1);
            } else {
                return false;
            }

        }

        return true;
    }

    public static boolean isAnagramBest(String s, String t) {
        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            alphabet[t.charAt(i) - 'a']--;
        }
        for (int i : alphabet) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
