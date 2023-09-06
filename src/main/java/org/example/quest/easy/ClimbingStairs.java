package org.example.quest.easy;

import java.util.ArrayList;
import java.util.List;

public class ClimbingStairs {
    public static void main(String[] args) {

        int n = 6;
        System.out.println(climbStairs(n));

    }
    public static int climbStairsSecond(int n) {
        if (n == 1) {
            return 1;
        }

        int n1 = 1;
        int n2 = 2;

        for (int i = 3; i < n+1; i++) {
            int temp = n1;
            n1 = n2;
            n2 = temp + n2;
        }
        return n2;
    }







    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int prev1 = 1;
        int prev2 = 2;

        for (int i = 3; i <= n; i++) {
            int newValue = prev1 + prev2;
            prev1 = prev2;
            prev2 = newValue;
        }

        return prev2;
    }

}
