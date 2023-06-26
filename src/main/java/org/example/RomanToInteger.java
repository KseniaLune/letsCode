package org.example;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(myRomanToInt(s));

    }
    public static int myRomanToInt(String s) {
        Map<Character, Integer> symbol = new HashMap<>();
        symbol.put('I', 1);
        symbol.put('V', 5);
        symbol.put('X', 10);
        symbol.put('L', 50);
        symbol.put('C', 100);
        symbol.put('D', 500);
        symbol.put('M', 1000);

        char[] characters = s.toCharArray();
        int result=0;
        for (int i = 0; i < characters.length; i++) {
            int numb = symbol.get(characters[i]);
            int nextNumb = numb;
            if (i+1<characters.length){
                nextNumb = symbol.get(characters[i+1]);
            }
            if(numb<nextNumb){
                result+=nextNumb-numb;
                i++;
            }else {
                result+=numb;
            }
        }
        return result;
    }
    public static int bestRomanToInt(String s) {
        int answer = 0, number = 0, prev = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if (number < prev) {
                answer -= number;
            }
            else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }
}
