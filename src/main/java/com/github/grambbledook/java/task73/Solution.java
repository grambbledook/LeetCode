package com.github.grambbledook.java.task73;

public class Solution {

    public void setZeroes(int[][] matrix) {
        boolean[] x = new boolean[matrix[0].length];
        boolean[] y = new boolean[matrix.length];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (matrix[j][i] == 0) {
                    x[i] = true;
                    y[j] = true;
                }
            }
        }

        for (int i = 0; i < x.length; i++) {
            if (x[i]) {
                for (int j = 0; j < y.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        for (int i = 0; i < y.length; i++) {
            if (y[i]) {
                for (int j = 0; j < x.length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}