package com.github.grambbledook.java.task332.dfs;

import com.github.grambbledook.java.task332.ReconstructItinerary;

import java.util.*;

public class Solution implements ReconstructItinerary {

    private static final String START = "JFK";

    private Map<String, PriorityQueue<String>> routes = new HashMap<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        initializeRoutes(tickets);

        LinkedList<String> route = new LinkedList<>();
        reconstruct(START, route);
        return route;
    }

    private void initializeRoutes(List<List<String>> tickets) {
        for (List<String> route : tickets) {
            String from = route.get(0);
            String to = route.get(1);
            routes.putIfAbsent(from, new PriorityQueue<>());

            routes.get(from).add(to);
        }
    }

    private void reconstruct(String from, LinkedList<String> route) {
        PriorityQueue<String> destinations = routes.get(from);

        while (destinations != null && !destinations.isEmpty()) {
            reconstruct(destinations.poll(), route);
        }

        route.addFirst(from);
    }

}