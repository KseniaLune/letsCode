package org.example.quest.medium;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences {
    public static void main(String[] args) {
        String s = "AAAAAAAAAAA";
        System.out.println(findRepeatedDnaSequences(s));
    }
    public static List<String> findRepeatedDnaSequences(String s) {
        int a = s.length();
        Set<String> result = new HashSet<>();
        if (s.length() < 10) {
            return new ArrayList<>(result);
        }
        int left = 0;
        Set<String> nonRepeated = new HashSet<>();

        for (int r = 9; r < s.length(); r++) {
            String sub = s.substring(left, r+1);
            if (!nonRepeated.add(sub)) {
                result.add(sub);
            }
            left++;
        }
        return new ArrayList<>(result);
    }

}
