package com.github.grambbledook.java.task64.dp;

import com.github.grambbledook.java.task64.MinPathSum;

public class Solution implements MinPathSum {

    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int n = grid.length;
        int m = grid[0].length;

        int[][] cache = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int path = min(cache, i, j);
                cache[i][j] = path + grid[i][j];
            }
        }

        return cache[n - 1][m - 1];
    }

    private int min(int[][] grid, int i, int j) {
        if (i == 0 && j == 0) return 0;
        int v1 = i > 0 ? grid[i - 1][j] : Integer.MAX_VALUE;
        int v2 = j > 0 ? grid[i][j - 1] : Integer.MAX_VALUE;
        return Math.min(v1, v2);
    }

}
