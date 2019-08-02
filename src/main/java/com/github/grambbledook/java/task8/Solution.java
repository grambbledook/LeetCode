package com.github.grambbledook.java.task8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    private enum State {NEW, MINUS, DIGIT, WS, PLUS, LETTER}

    private static  final Map<State, Set<State>> allowedTransitions = new HashMap<>() {{
        put(State.NEW, new HashSet<>(){{add(State.DIGIT);add(State.MINUS);add(State.PLUS);add(State.WS);}});
        put(State.PLUS, new HashSet<>(){{add(State.DIGIT);}});
        put(State.MINUS, new HashSet<>(){{add(State.DIGIT);}});
        put(State.DIGIT, new HashSet<>(){{add(State.DIGIT);}});
        put(State.WS, new HashSet<>() {{add(State.DIGIT);add(State.MINUS);add(State.PLUS);add(State.WS);}});
        put(State.LETTER, new HashSet<>());}};

    public int myAtoi(String str) {
        int start = Integer.MAX_VALUE;
        int end = 0;
        int sign = 1;
        State current = State.NEW;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            State transition = map(c);
            Set<State> allowed = allowedTransitions.get(current);

            if (allowed.contains(transition)) {
                end++;
                if (transition == State.DIGIT) {
                    if  (start == Integer.MAX_VALUE && c != '0') start = i;
                }
                if (transition == State.MINUS) {
                    sign = -1;
                }

            } else {
                break;
            }
            current = transition;
        }

        if (end - start > 10) {
            return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        long result = 0;
        while (start < end) {
            char c = str.charAt(start);
            result = result*10 + Character.digit(c, 10);
            start++;
        }

        if (result > Integer.MAX_VALUE ) {
            return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        } else {
            return (int) (sign * result);
        }

    }

    private State map(char c) {
        if (c == '-') return State.MINUS;
        else if (c == '+') return  State.PLUS;
        else if (c == ' ') return  State.WS;
        else if (Character.isDigit(c)) return  State.DIGIT;
        else return State.LETTER;
    }

}
