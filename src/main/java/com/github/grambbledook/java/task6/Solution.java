package com.github.grambbledook.java.task6;


import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {

    private static final int UP = -1;
    private static final int DOWN = 1;

    private int level = -1;
    private int direction = DOWN;
    private List<Character>[] rows;

    public String convert(String s, int numRows) {
        if (s == null || s.isEmpty() || numRows == 1) return s;
        rows = new List[Math.min(numRows, s.length())];

        for (char c: s.toCharArray()) {
            List<Character> row = nextRow(numRows);
            row.add(c);
        }

        StringBuilder sb = new StringBuilder(s.length());
        for (List<Character> row : rows) {
            for (Character c : row) sb.append(c);
        }

        return sb.toString();
    }

    private List<Character> nextRow(int numRows) {
        if (level == 0 && direction == UP) direction = DOWN;
        else if (level == numRows - 1 && direction == DOWN) direction = UP;

        level += direction;
        return getNextRow();
    }

    private List<Character> getNextRow() {
        if (rows[level] == null) rows[level] = new ArrayList();
        return rows[level];
    }

}
