package com.github.grambbledook.java.task322.memo;

import com.github.grambbledook.java.task322.CoinChange;

import java.util.Arrays;

public class Solution implements CoinChange {
    private int[] coins;
    private int[] cache;

    public int coinChange(int[] coins, int amount) {
        this.coins = coins;
        this.cache = new int[amount + 1];

        Arrays.fill(cache, -2);
        cache[0] = 0;

        return coinChange0(amount);
    }

    private int coinChange0(int amount) {
        if (amount < 0) return -1;

        if (cache[amount] != -2) return cache[amount];
        cache[amount] = caclulateMinCoins(amount);
        return cache[amount];
    }


    private int caclulateMinCoins(int amount) {
        int min = -1;
        for (int coin : coins) {

            int result = coinChange0(amount - coin);
            if (result < 0) continue;

            if (min == -1) min = result;
            else min = Math.min(min, result);
        }

        return min < 0 ? min : 1 + min;
    }

}
