package com.github.grambbledook.java.task668.bs;

import com.github.grambbledook.java.task668.FindKthNumber;


public class Solution implements FindKthNumber {

    public int findKthNumber(int n, int m, int k) {
        int lo = 0;
        int hi = n * m;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            int count = 0;
            for (int i = 1; i <= m; i++) {
                count += Math.min(mid / i, n);
            }

            if (count >= k) hi = mid;
            else lo = mid + 1;
        }

        return lo;
    }

}
