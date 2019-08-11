package com.github.grambbledook.java.task232;

import java.util.Stack;

class MyQueue {

    private Stack<Integer> first = new Stack<>();
    private Stack<Integer> second = new Stack<>();

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        first.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        populate();
        return second.pop();
    }

    private void populate() {
        if (second.isEmpty() && !first.isEmpty()) {
            while (!first.isEmpty()) {
                Integer i = first.pop();
                second.push(i);
            }
        }
    }

    /**
     * Get the front element.
     */
    public int peek() {
        populate();
        return second.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }
}