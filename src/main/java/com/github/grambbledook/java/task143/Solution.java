package com.github.grambbledook.java.task143;

import com.github.grambbledook.java.common.ListNode;

    import java.util.LinkedList;

    public class Solution {

        LinkedList<ListNode> deq = new LinkedList<>();

        public void reorderList(ListNode head) {
            deconstruct(head);

            for (head = deq.poll(); !deq.isEmpty();) {
                ListNode tail = deq.pollLast();
                head.next = tail;

                tail.next = deq.poll();
                head = tail.next;
            }

        }

        private void deconstruct(ListNode node) {
            while (node != null) {
                ListNode tmp = node;
                node = node.next;

                deq.offer(tmp);
                tmp.next = null;
            }
        }
    }
