package com.github.grambbledook.java.task867;

public class Solution {
    public int[][] transpose(int[][] A) {
        if (A.length == 1 && A[0].length == 1) return A;

        int x = A[0].length;
        int y = A.length;

        int[][] matrix = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++)
                matrix[i][j] = A[j][i];
        }
        return matrix;
    }
}
