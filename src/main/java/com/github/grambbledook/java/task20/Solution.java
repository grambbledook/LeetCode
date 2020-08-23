package com.github.grambbledook.java.task20;

import java.util.LinkedList;

public class Solution {

    public boolean isValid(String s) {
        var stack = new LinkedList<Character>();


        for (var c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            var prev = stack.peek();
            var isValid = true;

            switch (c) {
                case ']':
                    isValid = prev == '[';
                    break;
                case ')':
                    isValid = prev == '(';
                    break;
                case '}':
                    isValid = prev == '{';
                    break;

                default:
                    stack.push(c);
                    continue;
            }

            if (isValid) stack.pop();
            else return false;
        }

        return stack.isEmpty();
    }

}
