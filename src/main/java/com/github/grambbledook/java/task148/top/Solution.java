package com.github.grambbledook.java.task148.top;

import com.github.grambbledook.java.common.ListNode;
import com.github.grambbledook.java.task148.Sort;

public class Solution implements Sort {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode mid = middle(head);

        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    private ListNode middle(ListNode head) {
        ListNode tail = head;

        while (tail.next != null && tail.next.next != null) {
            tail = tail.next.next;
            head = head.next;
        }

        tail = head.next;
        head.next = null;
        return tail;
    }

    private ListNode merge(ListNode l, ListNode r) {
        if (l == null) return r;
        if (r == null) return l;

        ListNode result = new ListNode(0);

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
