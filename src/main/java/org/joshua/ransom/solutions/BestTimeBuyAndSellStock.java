package org.joshua.ransom.solutions;

import org.joshua.ransom.Solution;

import java.util.HashMap;
import java.util.Stack;

public class BestTimeBuyAndSellStock implements Solution<Integer, int[]> {

    @Override
    public Integer bruteForce(int[] prices) {
        return attemptTwo(prices);
    }

    private int attemptTwo(int[] prices) {
        var smallestPrice = prices[0];
        var highestProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            var priceOfDay = prices[i];
            var potentialProfit = priceOfDay - smallestPrice;
            if (potentialProfit > highestProfit) {
                highestProfit = potentialProfit;
            } else if (priceOfDay < smallestPrice) {
                smallestPrice = priceOfDay;
            }
        }
        return highestProfit;
    }

    /*
     * Time complexity was too big with 2 loops.
     */
    private int attemptOne(int[] prices) {
        var currentHighest = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = prices.length - 1; j > 0; j--) {
                if (i == j || j < i) {
                    continue;
                }
                var currentDayPrice = prices[i];
                var priceInFuture = prices[j];
                var netGain = priceInFuture - currentDayPrice;
                if (netGain > 0 && netGain > currentHighest) {
                    currentHighest = netGain;
                }
            }
        }
        return currentHighest;
    }
}
