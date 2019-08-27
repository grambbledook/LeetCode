package com.github.grambbledook.java.task399;

import java.util.*;

public class Solution {

    private Map<String, Map<String, Double>> data = new HashMap<>();

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        initialize(equations, values);

        double[] results = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> eq = queries.get(i);
            results[i] = calculate(eq.get(0), eq.get(1), new HashSet<>());
        }

        return results;
    }

    private void initialize(List<List<String>> equations, double[] values) {
        for (int i = 0; i < values.length; i++) {
            List<String> eq = equations.get(i);
            data.putIfAbsent(eq.get(0), new HashMap<>());
            data.putIfAbsent(eq.get(1), new HashMap<>());

            link(eq.get(0), eq.get(0), 1);
            link(eq.get(1), eq.get(1), 1);
            link(eq.get(0), eq.get(1), values[i]);
        }
    }

    private void link(String a, String b, double value) {
        data.get(a).put(b, value);
        data.get(b).put(a, 1 / value);
    }

    private Double calculate(String dividend, String divisor, Set<String> path) {
        Map<String, Double> mappings = data.get(dividend);
        path.add(dividend);

        if (mappings == null || data.get(divisor) == null) return -1.0;

        double result = 1;
        if (mappings.containsKey(divisor)) result *= mappings.get(divisor);
        else {
            result = -1;
            for (String third : mappings.keySet()) {
                if (path.contains(third)) continue;

                double value = mappings.get(third) == -1 ? -1 : calculate(third, divisor, path);
                if (value != -1.0) {
                    result = value * mappings.get(third);
                    break;
                }
            }

        }
        link(dividend, divisor, result);
        path.remove(dividend);
        return result;
    }
}