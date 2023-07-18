package org.example.quest.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BestTimetoBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int minBuy = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
           minBuy = Math.min(minBuy,prices[i]);
           maxProfit = Math.max(maxProfit, prices[i]-minBuy);
        }
        return maxProfit;
    }
}
