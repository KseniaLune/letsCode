package org.example.quest;

import java.util.ArrayList;
import java.util.List;

public class RansomNote {
    public static void main(String[] args) {
        String note = "aa";
        String magazine = "aaa";
        System.out.println(canConstruct(note, magazine));

    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] charsMagazine = magazine.toCharArray();
        char[] charsNote = ransomNote.toCharArray();
        List<Character> list = new ArrayList<>();
        for (char c:charsMagazine) {
            list.add(c);
        }

        for(char c: charsNote){
            if(list.contains(c)){
               int index =  list.indexOf(c);
               list.set(index, 'X');
            } else {
                return false;
            }
        }

        return true;
    }
}
