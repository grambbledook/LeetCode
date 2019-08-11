package com.github.grambbledook.java.task136;

public class Solution {
    public int singleNumber(int[] nums) {
        int number = 0;

        for (int num: nums) {
            number ^= num;
        }

        return number;
    }
}
