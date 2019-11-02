package com.github.grambbledook.java.task7;

public class Solution {
    public int reverse(int x) {
        long reversed = 0;

        int sign = x < 0 ? -1 : 1;
        int data = sign * x;
        while (data != 0) {
            int digit = data % 10;
            reversed = reversed * 10 + digit;
            data = data / 10;
        }

        if (reversed > Integer.MAX_VALUE || reversed <Integer.MIN_VALUE) return 0;
        return (int) (sign * reversed);
    }
}
