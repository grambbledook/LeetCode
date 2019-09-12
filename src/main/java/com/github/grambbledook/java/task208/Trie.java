package com.github.grambbledook.java.task208;


public class Trie {

    private final Node root = new Node();

    public void insert(String word) {
        Node node = root;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            Node next = node.children[index(c)];
            if (next == null) {
                next = new Node();
                node.children[index(c)] = next;
            }
            node = next;
        }
        node.endOfWord = true;
    }

    public boolean search(String word) {
        Node node = getNode(word);
        return node != null && node.endOfWord;
    }

    public boolean startsWith(String prefix) {
        return getNode(prefix) != null;
    }

    private Node getNode(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            Node next = node.children[index(c)];
            if (next == null) return null;
            node = next;
        }
        return node;
    }

    private int index(char c) {
        return c - 'a';
    }

    private static class Node {
        private Node[] children = new Node[26];
        private boolean endOfWord;
    }

}