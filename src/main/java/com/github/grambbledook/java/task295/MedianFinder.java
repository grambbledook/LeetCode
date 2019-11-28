package com.github.grambbledook.java.task295;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {

    private PriorityQueue<Integer> min = new PriorityQueue<>();
    private PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {
    }

    public void addNum(int num) {
        max.add(num);
        min.add(max.poll());

        if (min.size() > max.size()) max.add(min.poll());
    }

    public double findMedian() {
        if (max.size() == min.size()) return (max.peek() + min.peek()) / 2.0;
        else return max.peek();
    }

}

