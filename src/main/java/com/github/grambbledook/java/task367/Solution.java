package com.github.grambbledook.java.task367;

public class Solution {
    public boolean isPerfectSquare(int num) {
        long x = 0;
        long y = num;

        while (x <= y) {
            var mid = (y + x) / 2;

            var value = mid * mid;
            if (value == num) return true;
            else if (value > num) y = mid - 1;
            else x = mid + 1;
        }

        return false;
    }
}
