package com.github.grambbledook.java.common;

import java.util.ArrayList;
import java.util.List;

public interface ToList {

    default List<Integer> toList(int[] array) {
        List<Integer> result = new ArrayList<>(array.length);
        for (int i = 0; i < array.length; i++) {
            result.add(array[i]);
        }
        return result;
    }

}
