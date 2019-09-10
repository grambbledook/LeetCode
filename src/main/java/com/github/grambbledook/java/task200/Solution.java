package com.github.grambbledook.java.task200;

public class Solution {

    private static final char LAND = '1';
    private static final char WATER = '0';

    private int x;
    private int y;

    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;

        x = grid.length - 1;
        y = grid[0].length - 1;

        int count = 0;
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                if (grid[i][j] == LAND) {
                    visit(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void visit(char[][] grid, int i, int j) {
        if (i < 0 || i > x || j < 0 || j > y) return;

        if (grid[i][j] == LAND) {
            grid[i][j] = WATER;
            visit(grid, i, j - 1);
            visit(grid, i, j + 1);
            visit(grid, i - 1, j);
            visit(grid, i + 1, j);
        }
    }
}
