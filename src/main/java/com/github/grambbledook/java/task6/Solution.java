package com.github.grambbledook.java.task6;



public class Solution {

    private static final int up = -1;
    private static final int down = 1;

    private int direction = down;
    private int pos = -1;

    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder[] rows = initRows(numRows);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            StringBuilder sb = rows[getPosition(numRows)];
            sb.append(c);

        }

        return toString(rows);
    }

    private StringBuilder[] initRows(int numRows) {
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        return rows;
    }

    private int getPosition(int border) {
        if (direction == up && pos == 0) direction = down;
        else if (direction == down && pos == border -1) direction = up;

        pos += direction;
        return pos;
    }

    private String toString(StringBuilder[] rows) {
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb: rows) {
            result.append(sb.toString());
        }

        return result.toString();
    }

}
