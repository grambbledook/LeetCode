package com.github.grambbledook.java.task468.cycle;

import com.github.grambbledook.java.task468.Perimeter;

public class Solution implements Perimeter {
    public int islandPerimeter(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0;

        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) perimeter += countPerimeter(grid, i, j);
            }
        }

        return perimeter;
    }

    private int countPerimeter(int[][] grid, int i, int j) {
        int perimeter = 4;

        if (isIsland(grid, i, j - 1)) perimeter--;
        if (isIsland(grid, i, j + 1)) perimeter--;
        if (isIsland(grid, i - 1, j)) perimeter--;
        if (isIsland(grid, i + 1, j)) perimeter--;

        return perimeter;
    }

    private boolean isIsland(int[][] grid, int i, int j) {
        return i >= 0 && i < grid.length  && j >= 0 && j < grid[i].length  && grid[i][j] == 1;
    }
}
