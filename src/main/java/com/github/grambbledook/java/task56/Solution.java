package com.github.grambbledook.java.task56;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    private List<int[]> result = new LinkedList<>();

    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return new int[0][0];

        Arrays.sort(intervals, (x, y) -> x[0] - y[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int iStart = intervals[i][0];
            int iEnd = intervals[i][1];

            if (end < iStart) {
                result.add(new int[]{start, end});

                start = iStart;
                end = iEnd;
            }

            if (end < iEnd) end = iEnd;
        }
        result.add(new int[]{start, end});

        return makeResult();
    }

    private int[][] makeResult() {
        int[][] array = new int[result.size()][2];

        for (int i = 0; i < result.size(); i++) {
            array[i] = result.get(i);
        }

        return array;
    }

}
