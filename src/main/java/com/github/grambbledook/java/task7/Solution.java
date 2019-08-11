package com.github.grambbledook.java.task7;

public class Solution {
    public int reverse(int x) {
        long result = 0;
        int sign = x < 0 ? -1 : 1;

        x = Math.abs(x);
        while (x != 0) {

            int tmp = x % 10;
            result = result * 10 + tmp;

            x /= 10;
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;

        return sign * (int) result;
    }
}
