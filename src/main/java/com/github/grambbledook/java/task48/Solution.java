package com.github.grambbledook.java.task48;

import com.github.grambbledook.java.common.Swap;

public class Solution implements Swap {

    public void rotate(int[][] matrix) {
        if (matrix.length == 1) return;
        int n = matrix.length - 1;

        for (int i = 0; i <= n / 2; i++) {
            swapRow(matrix, i, n - i);
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                swapCell(matrix, i, j);
            }
        }
    }

}
