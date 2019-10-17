package com.github.grambbledook.java.task146;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private Node head;
    private Node tail;

    private final int capacity;
    private final Map<Integer, Node> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) return -1;

        pop(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = cache.get(key);

        if (node != null) {
            node.value = value;
            pop(node);
        } else {
            node = new Node(key, value);

            if (head == null) tail = node;
            else {
                head.prev = node;
                node.next = head;
            }

            head = node;
            cache.put(key, node);
            if (cache.size() > capacity) dropTail();
        }
    }

    private void pop(Node node) {
        if (node == head) return;

        if (node == tail) {
            tail = node.prev;
            tail.next = null;
            node.prev = null;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.prev = null;
        }

        head.prev = node;
        node.next = head;
        head = node;
    }

    private void dropTail() {
        Node node = tail;
        tail = tail.prev;
        tail.next = null;

        cache.remove(node.key);
    }

    private static class Node {
        int key;
        int value;

        Node prev;
        Node next;

        private Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}