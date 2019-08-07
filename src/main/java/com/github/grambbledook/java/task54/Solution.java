package com.github.grambbledook.java.task54;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new ArrayList<>();

        int x = matrix[0].length;
        int y = matrix.length;

        List<Integer> result = new ArrayList<>();

        int l = 0;
        int r = x - 1;
        int t = 0;
        int b = y - 1;

        while (l < r && t < b) {
            for (int i = l; i <= r; i++) {
                result.add(matrix[t][i]);
            }

            for (int i = t + 1; i <= b; i++) {
                result.add(matrix[i][r]);
            }

            for (int i = r - 1; i >= l; i--) {
                result.add(matrix[b][i]);
            }

            for (int i = b - 1; i > t; i--) {
                result.add(matrix[i][l]);
            }

            l++;
            b--;
            r--;
            t++;

        }

        if (isRectangle(x, y) && isCenterElement(l, t, r, b)) {
            result.add(matrix[t][l]);
        } else if (isLastRow(t, b) && notLastElement(l, r)) {
            for (int i = l; i <= r; i++) {
                result.add(matrix[t][i]);
            }
        } else if (isLastRow(l, r) && notLastElement(t, b)) {
            for (int i = t; i <= b; i++) {
                result.add(matrix[i][l]);
            }
        }
        return result;
    }

    private boolean isRectangle(int x, int y) {
        return x == y;
    }

    private boolean isLastRow(int x, int x1) {
        return x == x1;
    }

    private boolean isCenterElement(int x, int y, int x1, int y1) {
        return x == x1 && y == y1;
    }

    private boolean notLastElement(int a, int b) {
        return a != b;
    }

}