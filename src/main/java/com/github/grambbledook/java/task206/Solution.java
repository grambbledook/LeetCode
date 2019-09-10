package com.github.grambbledook.java.task206;

import com.github.grambbledook.java.common.ListNode;

public class Solution {

    public ListNode reverseList(ListNode node) {
        if (node == null) return node;

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

}
