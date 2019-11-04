package com.github.grambbledook.java.task973;

import java.util.Arrays;

public class Solution implements FindClosest{

    public int[][] kClosest(int[][] points, int K) {
        quickselect(points, K, 0, points.length - 1);

        return Arrays.copyOfRange(points, 0, K);
    }

    private void quickselect(int[][] points, int k, int l, int r) {
        if (l >= r) return;

        int mid = partition(points, l, r);

        if (k <= mid) quickselect(points, k, l, mid - 1);
        else quickselect(points, k, mid + 1, r);
    }

    private int partition(int[][] points, int l, int r) {
        int pivot = distance(points[r]);
        int i = l;
        for (int j = l; j < r; j++) {
            if (distance(points[j]) < pivot) {
                swap(points, i, j);
                i++;
            }
        }
        swap(points, i, r);
        return i;
    }

    private void swap(int[][] points, int i, int j) {
        int[] tmp = points[i];
        points[i] = points[j];
        points[j] = tmp;
    }

    private int distance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }

}
