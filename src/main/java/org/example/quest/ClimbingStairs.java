package org.example.quest;

import java.util.ArrayList;
import java.util.List;

public class ClimbingStairs {
    public static void main(String[] args) {

        int n = 6;
        System.out.println(climbStairs(n));

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
