package com.github.grambbledook.java.task9;

public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        else if (x == 0) return true;
        else return isPalindrome0(x);
    }

    private boolean isPalindrome0(int x) {
        int[] array = new int[10];

        int idx = 0;
        while (x != 0) {
            array[idx] = x % 10;
            x /= 10;
            idx++;
        }

        for (int i = 0; i < idx / 2; i++) {
            if (array[i] != array[idx - 1 - i]) return false;
        }

        return true;
    }
}
