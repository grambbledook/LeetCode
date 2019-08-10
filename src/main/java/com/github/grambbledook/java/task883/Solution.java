package com.github.grambbledook.java.task883;

public class Solution {

    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int maxX = 0;
            int maxY = 0;
            for (int j = 0; j< n; j++) {
                if (grid[i][j] > maxX) maxX = grid[i][j];
                if (grid[j][i] > maxY) maxY = grid[j][i];
                if (grid[i][j] > 0) sum += 1;
            }
            sum += maxX + maxY;
        }

        return sum;
    }
}