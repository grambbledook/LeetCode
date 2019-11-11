package com.github.grambbledook.java.task64;

public class Solution implements MinPathSum {
    private int[] DOWN = {0, 1};
    private int[] RIGHT = {1, 0};

    private int[][] result;

    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int n = grid.length;
        int m = grid[0].length;

        result = new int[n][m];

        dfs(grid, 0, 0, 0);
        return result[n - 1][m - 1];
    }


    private void dfs(int[][] grid, int x, int y, int sum) {
        if (x >= grid.length || y >= grid[0].length) return;

        int current = sum + grid[x][y];
        result[x][y] = Math.min(current, result[x][y] == 0 ? current : result[x][y]);

        dfs(grid, x + RIGHT[0], y + RIGHT[1], current);
        dfs(grid, x + DOWN[0], y + DOWN[1], current);
    }

}
