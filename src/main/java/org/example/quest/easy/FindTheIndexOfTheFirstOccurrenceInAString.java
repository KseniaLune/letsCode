package org.example.quest.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
       String haystack = "leeycode";
        String needle = "yco";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
//        Pattern pattern = Pattern.compile(needle);
//        Matcher matcher = pattern.matcher(haystack);
//        if(!matcher.find()){
//            return -1;
//        }
//
//        return matcher.start();
    }
}
