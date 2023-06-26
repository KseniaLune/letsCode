package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("qwerty \"azerty\" "));


    }
    public static boolean isPalindrome(String s) {
        System.out.println(s);

        char [] charToRemove = "!@#$%^&*()_+,.? :'/|=-~`{[}]±§\"".toCharArray();

        for (char c : charToRemove) {
            s = s.replace(String.valueOf(c), "");
        }

        s = s.toLowerCase();
        System.out.println(s);
        List<Character> list = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (char c: chars){
            list.add(c);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (iterator.hasNext()&&reverseIterator.hasPrevious()){
            if(iterator.next() !=reverseIterator.previous()){
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}
