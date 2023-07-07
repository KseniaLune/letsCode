package org.example;

public class IsSubsequence {
    public static void main(String[] args) {

        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t){
        int i = 0;
        for (int j=0; i <s.length()&&j<t.length();j++) {
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
        }
        if(i!=s.length()){
            return false;
        }
        return true;
    }
}
