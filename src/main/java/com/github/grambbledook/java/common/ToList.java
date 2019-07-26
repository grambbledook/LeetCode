package com.github.grambbledook.java.common;

import java.util.ArrayList;
import java.util.List;

public interface ToList {

    default List<Integer> toList(int[] array) {
        List<Integer> result = new ArrayList<>(array.length);
        for (int i : array) {
            result.add(i);
        }
        return result;
    }

}
