package com.github.grambbledook.java.task503;


import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;

        int[] result = new int[n];
        Arrays.fill(result, -1);
        LinkedList<Integer> stack = new LinkedList<>();

        for (int i = 0; i < 2* n; i ++) {
            int val = nums[i % n];

            while (!stack.isEmpty() && nums[stack.peek()] < val) {
                result[stack.pop()] = val;
            }

            if (i < n) stack.push(i);
        }

        return result;
    }
}
