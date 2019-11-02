package com.github.grambbledook.java.task148.bottom;

import com.github.grambbledook.java.common.ListNode;
import com.github.grambbledook.java.task148.Sort;

public class Solution implements Sort {

    private static final int SIZE = 32;

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        int i;
        ListNode next;
        ListNode result = head;
        ListNode[] array = new ListNode[SIZE];

        while (result != null) {
            next = result.next;
            result.next = null;
            for (i = 0; i < array.length; i++) {
                if (array[i] == null) break;

                result = merge(array[i], result);
                array[i] = null;
            }

            if (i == array.length) i--;
            array[i] = result;
            result = next;
        }

        for (i = 0; i < array.length; i++) result = merge(array[i], result);
        return result;
    }

    private ListNode merge(ListNode l, ListNode r) {
        ListNode result = new ListNode(-1);

        ListNode head = result;
        while (l != null && r != null) {
            if (l.val < r.val) {
                head.next = l;
                l = l.next;
            } else {
                head.next = r;
                r = r.next;
            }
            head = head.next;
        }

        while (l != null) {
            head.next = l;
            l = l.next;
            head = head.next;
        }

        while (r != null) {
            head.next = r;
            r = r.next;
            head = head.next;
        }

        return result.next;
    }
}
