package com.github.grambbledook.java.task45.greedy;

import com.github.grambbledook.java.task45.JumpGame2;

public class Solution implements JumpGame2 {

    public int jump(int[] nums) {
        if (nums.length == 1) return 0;

        int count = 0;

        int l = 0;
        int r = 0;
        int next = 0;

        while (r < nums.length - 1) {
            if (l >= nums.length -1) return -1;

            next = Math.max(next, nums[l] + l);

            if (l == r) {
                r = next;
                count++;
            }

            l++;
        }

        return count;
    }
}
