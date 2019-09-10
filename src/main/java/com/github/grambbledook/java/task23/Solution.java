package com.github.grambbledook.java.task23;


import com.github.grambbledook.java.common.ListNode;

public class Solution implements MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;

        if (lists.length < 2) return lists[0];

        int iteration = 1;

        while (iteration < lists.length) {
            for (int i = 0; i < lists.length; i += 2 * iteration) {
                ListNode l = lists[i];
                ListNode r = (i + iteration >= lists.length) ? null : lists[i + iteration];

                lists[i] = merge(l, r);
            }
            iteration *= 2;
        }

        return lists[0];
    }

    private ListNode merge(ListNode l, ListNode r) {
        ListNode node = new ListNode(0);
        ListNode tmp = node;

        while (l != null && r != null) {
            if (l.val < r.val) {
                tmp.next = l;
                l = l.next;
            } else {
                tmp.next = r;
                r = r.next;
            }
            tmp = tmp.next;
        }

        append(tmp, l);
        append(tmp, r);

        return node.next;
    }

    private ListNode append(ListNode result, ListNode origin) {
        while (origin != null) {
            result.next = origin;
            result = result.next;
            origin = origin.next;
        }
        return result;
    }

}
