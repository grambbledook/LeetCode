package com.github.grambbledook.java.task23.brute;

import com.github.grambbledook.java.task23.MergeKLists;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution implements MergeKLists {

    private static final Comparator<ListNode> comparator = new Comparator<ListNode>() {
        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.val - o2.val;
        }
    };

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> index = new PriorityQueue<>(comparator);

        ListNode tmp = new ListNode(0);
        ListNode result = tmp;

        int wide = 0;
        int height = 0;
        while (true) {
            var flag = false;

            for (int i = 0; i < lists.length; i++) {
                ListNode list = lists[i];
                if (list == null) continue;

                 wide++;
                                    flag = true;
                index.add(list);
                lists[i] = list.next;
            }

            if (!flag) break;
            height++;
        }


        int size = index.size();
        for (int i = 0; i < size; i++) {
            result.next = index.poll();
            result = result.next;
            result.next = null;
        }

        return tmp.next;
    }


}