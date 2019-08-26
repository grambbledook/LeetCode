package com.github.grambbledook.java.task207;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    private int[] cache;
    private Map<Integer, Set<Integer>> courses = new HashMap<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) return true;
        if (prerequisites.length == 0) return true;

        init(numCourses, prerequisites);

        for (int course : courses.keySet()) {
            if (canTake(course, new HashSet<>())) numCourses--;
            if (numCourses == 0) break;
        }

        return numCourses == 0;
    }

    private void init(int total, int[][] prerequisites) {
        cache = new int[total];

        for (int course = 0; course < total; course++) {
            courses.put(course, new HashSet<>());
        }

        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int dependency = prerequisite[1];
            courses.get(course).add(dependency);
        }
    }


    private boolean canTake(int course, Set<Integer> context) {
        if (cache[course] != 0) return cache[course] == 1;

        Set<Integer> dependencies = courses.get(course);
        if (dependencies.isEmpty()) return true;

        boolean result = true;
        context.add(course);
        for (int dependency : dependencies) {
            if (!context.contains(dependency)) result &= canTake(dependency, context);
            else {
                result = false;
                break;
            }
        }
        context.remove(course);

        cache[course] = result ? 1 : -1;
        return result;
    }
}
