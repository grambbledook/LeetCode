package com.github.grambbledook.java.task468;


public class Solution implements Perimeter{

    public int islandPerimeter(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0;

        boolean[][] visited = new boolean[grid.length][grid[0].length];

        return dfs(grid, 0, 0, visited);
    }

    private int dfs(int[][] grid, int n, int m, boolean[][] visited) {
        if (n < 0 || m < 0 || n >= grid.length || m >= grid[0].length) return 0;

        for (int i = n; i < grid.length; i++) {
            for (int j = m; j < grid[0].length; j++) {
                if (visited[i][j]) return 0;

                visited[i][j] = true;
                if (grid[i][j] == 0) continue;
                else return countEdges(grid, i, j)
                        + dfs(grid, i, j - 1, visited)
                        + dfs(grid, i, j + 1, visited)
                        + dfs(grid, i - 1, j, visited)
                        + dfs(grid, i + 1, j, visited);
            }
        }

        return 0;
    }

    private int countEdges(int[][] grid, int i, int j) {
        int edges = 0;

        if (i == 0 || grid[i - 1][j] == 0) edges++;
        if (i == grid.length - 1 || grid[i + 1][j] == 0) edges++;
        if (j == 0 || grid[i][j - 1] == 0) edges++;
        if (j == grid[0].length - 1 || grid[i][j + 1] == 0) edges++;

        return edges;
    }

}
