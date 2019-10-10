package com.github.grambbledook.java.task143.reverse;

import com.github.grambbledook.java.common.ListNode;
import com.github.grambbledook.java.task143.ReorderList;


public class Solution implements ReorderList {

    public void reorderList(ListNode head) {
        ListNode r = center(head);

        r = reverse(r);
        merge(head, r);
    }

    private ListNode center(ListNode node) {
        if (node == null) return null;

        ListNode mid = node;
        ListNode tail = node;

        while (tail != null) {
            tail = tail.next;
            if (tail != null) {
                mid = mid.next;
                tail = tail.next;
            }
        }
        ListNode result = mid.next;
        mid.next = null;
        return result;
    }

    private ListNode reverse(ListNode node) {
        if (node == null) return null;

        ListNode head = node;
        ListNode tail = head.next;
        while (tail != null) {
            ListNode tmp = tail.next;

            tail.next = head;
            head = tail;
            tail = tmp;
        }

        node.next = null;
        return head;
    }

    private void merge(ListNode list1, ListNode list2) {

        while (list2 != null) {
            ListNode l = list1;
            ListNode r = list2;

            list1 = list1.next;
            list2 = list2.next;

            r.next = l.next;
            l.next = r;
        }
    }
}
