package com.github.grambbledook.java.task50;

public class Solution {

    public double myPow(double x, int n) {


        if (n < 0) {
            x = 1.0 / x;
            n = n == Integer.MIN_VALUE ? Integer.MAX_VALUE: -n;
        }

        double result = 1.0;
        while (n > 0) {
            if ((n & 1) == 1) {
                result *= x;
            }

            x *= x;
            n >>= 1;
        }

        return result;
    }

}

