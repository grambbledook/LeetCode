package com.github.grambbledook.java.task210;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    private static final int[] EMPTY = new int[0];

    private int offset;
    private int[] schedule;
    private int[] visited;

    private Map<Integer, Set<Integer>> dependencies = new HashMap<>();

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) return EMPTY;
        init(numCourses, prerequisites);

        for (int course = 0; course < numCourses; course++) {
            boolean result = takeCourse(course, new boolean[numCourses]);
            if (!result) return EMPTY;
        }

        return schedule;
    }

    private void init(int numCourses, int[][] prerequisites) {
        schedule = new int[numCourses];
        visited = new int[numCourses];

        for (int course = 0; course < numCourses; course++) {
            dependencies.put(course, new HashSet<>());
        }

        if (prerequisites == null) return;
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int dependency = prerequisite[1];

            dependencies.get(course).add(dependency);
        }
    }

    private boolean takeCourse(int course, boolean[] context) {
        if (context[course] && visited[course] != 1) return false;
        else if (visited[course] != 0) return visited[course] == 1;

        context[course] = true;

        Set<Integer> requirements = dependencies.get(course);
        boolean result = true;
        for (int prerequisite : requirements) {
            result &= takeCourse(prerequisite, context);
        }

        visited[course] = result ? 1 : -1;
        schedule[offset++] = course;
        return visited[course] == 1;
    }
}
