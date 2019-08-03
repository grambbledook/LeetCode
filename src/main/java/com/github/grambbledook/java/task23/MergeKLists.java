package com.github.grambbledook.java.task23;

import com.github.grambbledook.java.task23.brute.Solution;

public interface MergeKLists {
    ListNode mergeKLists(Solution.ListNode[] lists);

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
}

