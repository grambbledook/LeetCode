package com.github.grambbledook.java.task380;

import java.util.*;

public class RandomizedSet {


    private Map<Integer, Integer> coordinates = new HashMap<>();
    private List<Integer> data = new ArrayList<>();
    private Random rnd = new Random();

    public RandomizedSet() {

    }

    public boolean insert(int val) {
        if (coordinates.containsKey(val)) return false;

        data.add(val);
        coordinates.put(val, data.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!coordinates.containsKey(val)) return false;

        int size = data.size();
        swapWithTail(val, size);
        return data.remove(size - 1) != null && coordinates.remove(val) != null;
    }

    private void swapWithTail(int val, int size) {
        int idx = coordinates.get(val);
        int tmp = data.get(size - 1);

        data.set(idx, tmp);
        coordinates.put(tmp, idx);
    }

    public int getRandom() {
        int size = data.size();

        return data.get(rnd.nextInt(size));
    }

}