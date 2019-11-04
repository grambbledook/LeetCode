package com.github.grambbledook.java.task668;

import java.util.PriorityQueue;

public class Solution implements FindKthNumber {

    public int findKthNumber(int n, int m, int k) {
        if (n * m < k) return -1;
        if (k == n * m) return n * m;

        PriorityQueue<Integer> queue = new PriorityQueue<>(k + 1, (o1, o2) -> o2 - o1);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                int current = i * j;
                if (!queue.isEmpty() && queue.size() == k) {
                    if (queue.peek() > current) queue.remove();
                    else break;
                }

                queue.add(current);
            }
        }

        return queue.isEmpty() ? -1 : queue.peek();
    }

}
