package com.github.grambbledook.java.task9;

public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        else if (x == 0) return true;
        else return isPalindrome0(x);
    }

    private boolean isPalindrome0(int x) {
        int[] nums = new int[10];

        int idx = 0;

        while (x!= 0) {
            int digit = x % 10;
            nums[idx++] = digit;

            x /= 10;
        }

        for (int i =0; i < idx; i++) {
            if (nums[i] != nums[idx -i -1]) return false;
        }

        return true;
    }
}
