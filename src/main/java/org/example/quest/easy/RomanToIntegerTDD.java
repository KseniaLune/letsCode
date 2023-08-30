package org.example.quest.easy;

import java.util.Set;

public class RomanToIntegerTDD {
    public static final char ONE = 'I';
    public static final char FIVE = 'V';
    public static final char TEN = 'X';
    public static final char FIFTY = 'L';
    public static final char HUNDRED = 'C';
    public static final char FIVE_HUNDRED = 'D';
    public static final char THOUSAND = 'M';

    public static final Set<Character> ROMAN_DIGITS = Set.of(
        ONE, FIVE, TEN, FIFTY, HUNDRED, FIVE_HUNDRED, THOUSAND
    );

    public static int romanToInt(String s) {
        String upperS = s.toUpperCase();
        int result = 0;
        int num = 0;

        for (int i = upperS.length() - 1; i >= 0; i--) {
            switch (upperS.charAt(i)) {
                case ONE -> num = 1;
                case FIVE -> num = 5;
                case TEN -> num = 10;
                case FIFTY -> num = 50;
                case HUNDRED -> num = 100;
                case FIVE_HUNDRED -> num = 500;
                case THOUSAND -> num = 1000;
            }
            if (4 * num < result) {
                result -= num;
            } else {
                result += num;
            }
        }
        return result;
    }
}
