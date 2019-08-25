package com.github.grambbledook.java.task1;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> sums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            sums.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            Integer j = sums.get(target - nums[i]);

            if (j != null && i != j) {
                return new int[]{i, j};
            }
        }

        return new int[]{0, 0};
    }

}
