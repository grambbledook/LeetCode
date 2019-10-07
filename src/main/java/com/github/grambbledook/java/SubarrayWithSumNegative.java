package com.github.grambbledook.java;

import java.util.HashMap;
import java.util.Map;

public class SubarrayWithSumNegative {

    public int[] find(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int diff = sum - target;

            if (diff == 0) return new int[]{0, i};

            Integer j = map.get(diff);
            if (j != null) return new int[]{j + 1, i};

            map.put(sum, i);
        }

        return new int[]{-1, -1};
    }
}
