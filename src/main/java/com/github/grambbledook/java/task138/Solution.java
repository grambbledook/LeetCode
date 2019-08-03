package com.github.grambbledook.java.task138;

import java.util.IdentityHashMap;

public class Solution {

    public static class Node {
        public int val;
        public Node next;
        public Node random;

        public Node() {
        }

        public Node(int _val, Node _next, Node _random) {
            val = _val;
            next = _next;
            random = _random;
        }
    }

    private final IdentityHashMap<Node, Node> cache = new IdentityHashMap<>();

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        if (cache.containsKey(head)) return cache.get(head);

        Node copy = new Node();
        copy.val = head.val;

        cache.put(head, copy);
        copy.next = copyRandomList(head.next);
        copy.random = copyRandomList(head.random);

        return copy;
    }


}
