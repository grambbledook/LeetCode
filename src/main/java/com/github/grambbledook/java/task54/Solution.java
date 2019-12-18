package com.github.grambbledook.java.task54;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return Collections.emptyList();

        int n = matrix[0].length;
        int m = matrix.length;

        int l = 0;
        int r = n - 1;
        int t = 0;
        int b = m - 1;

        List<Integer> list = new ArrayList<>(n * m);
        while (l < r && t < b) {
            for (int i = l; i <= r; i++) {
                list.add(matrix[t][i]);
            }
            t++;

            for (int i = t; i <= b; i++) {
                list.add(matrix[i][r]);
            }
            r--;

            for (int i = r; i >= l; i--) {
                list.add(matrix[b][i]);
            }
            b--;

            for (int i = b; i >= t; i--) {
                list.add(matrix[i][l]);
            }
            l++;
        }

        while (t == b && l <= r) list.add(matrix[t][l++]);
        while (l == r && t <= b) list.add(matrix[t++][l]);

        return list;
    }

}