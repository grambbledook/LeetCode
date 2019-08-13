package com.github.grambbledook.java.task322.brute;

import com.github.grambbledook.java.task322.CoinChange;

public class Solution implements CoinChange {

    public int coinChange(int[] coins, int amount) {
        return coinChange0(coins, amount);
    }

    private int coinChange0(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;

        return caclulateMinCoins(coins, amount);
    }

    private int caclulateMinCoins(int[] coins, int amount) {
        int min = -1;
        for (int coin : coins) {

            int result = coinChange0(coins, amount - coin);
            if (result < 0) continue;

            if (min == -1) min = result;
            else min = Math.min(min, result);
        }

        return min < 0 ? min : 1 + min;
    }

}
