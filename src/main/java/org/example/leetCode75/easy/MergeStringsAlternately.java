package org.example.leetCode75.easy;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "xyz";

        System.out.println(mergeAlternatelyThird(s1,s2));
    }

    public static String mergeAlternatelyFirst(String word1, String word2) {
        char[] wordOne = word1.toCharArray();
        char[] wordTwo = word2.toCharArray();
        int indexOne = 0, indexTwo = 0;

        String res = "";
        while (indexOne < wordOne.length || indexTwo < wordTwo.length){
            if (indexOne < wordOne.length && indexTwo < wordTwo.length){
                res += wordOne[indexOne];
                res += wordTwo[indexTwo];

                indexOne++;
                indexTwo++;
            } else if (indexOne < wordOne.length) {
                res += wordOne[indexOne];
                indexOne++;
            } else if (indexTwo < wordTwo.length){
                res += wordTwo[indexTwo];
                indexTwo++;
            }
        }
        return res;
    }
    public static String mergeAlternatelySecond(String word1, String word2) {
        int indexOne = 0, indexTwo = 0;

        String res = "";
        while (indexOne < word1.length() || indexTwo < word2.length()){
            if (indexOne < word1.length() && indexTwo < word2.length()){
                res += word1.charAt(indexOne);
                res += word2.charAt(indexTwo);

                indexOne++;
                indexTwo++;
            } else if (indexOne < word1.length()) {
                res += word1.charAt(indexOne);
                indexOne++;
            } else if (indexTwo < word2.length()){
                res += word2.charAt(indexTwo);
                indexTwo++;
            }
        }
        return res;
    }
    public static String mergeAlternatelyThird(String word1, String word2) {
        int index = 0;

        StringBuilder res = new StringBuilder();
        while (index < word1.length() || index < word2.length()) {
            if (index < word1.length()) {
                res.append(word1.charAt(index));
            }
            if (index < word2.length()) {
                res.append(word2.charAt(index));
            }
            index++;
        }
        return res.toString();
    }
}
