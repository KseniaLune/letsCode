package org.example.quest.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        reverseWords("  hello      world  ");
    }

    public static String reverseWords(String s) {
        String trim = s.trim();
        String[] s1 = trim.split(" ");
//        String[] s1 = trim.split("//s+");
        String res = "";

        for (int i = s1.length-1; i >=0; i--) {
            if(s1[i].isBlank())continue;
            res = res+s1[i]+" ";
        }
        System.out.println(res.trim());
        return res.trim();
    }
}
