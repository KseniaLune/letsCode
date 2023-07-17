package org.example.quest;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(fizzbuzztest(15));
    }

    public static List<String> fizzbuzztest(int value) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i < 16; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                result.add("Fizz");
                continue;
            } else if (i % 5 == 0 && i % 3 != 0) {
                result.add("Buzz");
                continue;
            } else if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
                continue;
            } else {
                result.add(String.valueOf(i));
            }

        }
        return result;
    }
}
