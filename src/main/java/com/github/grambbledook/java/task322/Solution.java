package com.github.grambbledook.java.task322;

import java.util.Arrays;

//Failed leet code tests :(
public class Solution implements CoinChange {

    public int coinChange(int[] coins, int amount) {
        int result = 0;

        Arrays.sort(coins);
        for (int i = coins.length - 1; i >= 0; i--) {
            int count = amount / coins[i];
            result += count;
            amount -= count * coins[i];
        }

        return amount == 0 ? result : -1;
    }
}
