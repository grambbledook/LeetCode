package com.github.grambbledook.java.common;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return String.format("( head = %s,  tail = %s)", val, next);
    }
}