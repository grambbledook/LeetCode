package com.github.grambbledook.java.task11.brure;


import com.github.grambbledook.java.task11.MaxArea;

public class Solution implements MaxArea {
    public int maxArea(int[] height) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                int current = (j - i) * Math.min(height[i], height[j]);
                if (current > max) max = current;
            }
        }
        return max;
    }
}