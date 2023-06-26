package org.example;

public class FizzBuzzTest {
    public byte[] fizzbuzztest(int value) {



        if (value % 3 == 0&&value % 5 != 0) {
            return "Fizz".getBytes();
        } else if (value % 5 == 0&&value % 3 != 0) {
            return "Buzz".getBytes();
        } else if (value % 3 == 0 && value % 5 == 0) {
            return "FizzBuzz".getBytes();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
