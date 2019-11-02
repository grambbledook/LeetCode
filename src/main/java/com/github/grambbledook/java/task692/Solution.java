package com.github.grambbledook.java.task692;

import java.util.*;

public class Solution {
    private Map<String, Integer> freq = new HashMap<>();

    private final Comparator<String> comparator = new Comparator<String>() {
        @Override
        public int compare(String l, String r) {
            return freq.get(l).equals(freq.get(r)) ? r.compareTo(l) : freq.get(l) - freq.get(r);
        }
    };

    public List<String> topKFrequent(String[] words, int k) {
        for (int i = 0; i < words.length; i++) {
            Integer count = freq.put(words[i], 1);
            if (count != null) freq.put(words[i], ++count);
        }

        PriorityQueue<String> heap = new PriorityQueue<>(k + 1, comparator);

        for (String word : freq.keySet()) {
            heap.add(word);
            if (heap.size() > k) heap.poll();
        }

        List<String> result = new ArrayList<>(k);
        while (!heap.isEmpty()) {
            result.add(heap.poll());
        }

        Collections.reverse(result);
        return result;
    }

}
