package com.github.grambbledook.java.task973.iterative;

import com.github.grambbledook.java.task973.FindClosest;

import java.util.Arrays;

public class Solution implements FindClosest {

    public int[][] kClosest(int[][] points, int K) {
        quickselect(points, K);

        return Arrays.copyOfRange(points, 0, K);
    }

    private void quickselect(int[][] points, int k) {
        int l = 0;
        int r = points.length -1;

        while (l < r) {
            int mid = partition(points, l, r);

            if (k <= mid) r =  mid - 1;
            else l = mid + 1;
        }
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
