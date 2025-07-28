package org.mudrud.leetcode.easy.problem_121;

public class Solution {

    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }
            if (profit < prices[i] - buy) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}