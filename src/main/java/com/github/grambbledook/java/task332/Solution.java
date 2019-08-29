package com.github.grambbledook.java.task332;

import java.util.*;

public class Solution implements ReconstructItinerary {

    private static final String START = "JFK";

    private Map<String, Set<String>> routes = new HashMap<>();
    private HashMap<String, Integer> remainingTickets = new HashMap<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        initializeRoutes(tickets);

        ArrayList<String> route = new ArrayList<>();
        reconstruct(START, START, route);
        return route;
    }

    private void initializeRoutes(List<List<String>> tickets) {
        addTicket(START, START);

        for (List<String> route : tickets) {
            String from = route.get(0);
            String to = route.get(1);
            routes.putIfAbsent(from, new TreeSet<>());

            routes.get(from).add(to);
            addTicket(from, to);
        }
    }

    private boolean reconstruct(String from, String to, List<String> route) {
        if (useTicket(from, to) >= 0) {
            route.add(to);

            boolean success = false;
            Set<String> destinations = routes.get(to);
            if (destinations != null && !destinations.isEmpty()) {
                for (String destination : destinations) {
                    success = reconstruct(to, destination, route);

                    if (success) break;
                }
            }
            if (!success && remainingTickets.size() > 0) abort(from, to, route);
            return success;
        }

        return remainingTickets.size() == 0;
    }

    private void abort(String from, String to, List<String> route) {
        route.remove(route.size() - 1);
        addTicket(from, to);
    }

    private void addTicket(String from, String to) {
        String key = from + to;
        Integer v = remainingTickets.get(key);
        if (v == null) remainingTickets.put(key, 1);
        else remainingTickets.put(key, ++v);
    }

    private int useTicket(String from, String to) {
        String key = from + to;
        Integer v = remainingTickets.get(key);
        v = v == null? -1: --v;

        if (v <= 0) remainingTickets.remove(key);
        else remainingTickets.put(key, v);
        return v;
    }
}