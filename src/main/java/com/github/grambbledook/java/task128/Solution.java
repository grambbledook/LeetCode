package com.github.grambbledook.java.task128;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestConsecutive(int[] nums) {

        Map<Integer, Integer> forward = new HashMap<>();
        Map<Integer, Integer> bakward = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            forward.put(i, nums[i]);
            bakward.put(nums[i], i);
        }


        int[] length = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

            }

        }

        return 0;

    }
}
