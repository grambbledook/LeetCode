package com.github.grambbledook.java.task217;

import java.util.HashSet;

public class Solution {
    private HashSet<Integer> integers = new HashSet<>();
    public boolean containsDuplicate(int[] nums) {

        for (int i : nums) {
            boolean duplicate = integers.add(i);

            if (!duplicate) return true;
        }
        return  false;
    }
}
