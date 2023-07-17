package org.example.quest;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "a";
        String s = "dog cat cat fish";

        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] arrString = s.split(" ");
        char[] chars = pattern.toCharArray();
        if (chars.length != arrString.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i]) && !map.containsValue(arrString[i])) {
                map.put(chars[i], arrString[i]);
            } else if (!map.containsKey(chars[i]) && map.containsValue(arrString[i])) {
                return false;
            } else {
                if (!map.get(chars[i]).equals(arrString[i])) {
                    return false;
                }
            }

        }
        return true;
    }
}
