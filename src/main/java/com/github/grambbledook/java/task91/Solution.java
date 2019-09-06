package com.github.grambbledook.java.task91;


public class Solution {

    public int numDecodings(String s) {
        if (s.length() == 0 || s.charAt(0) == '0') return 0;

        int first = 1;
        int second = 1;

        for (int i = 1; i <= s.length() - 1; i++) {
            int data = Integer.parseInt(s.substring(i - 1, i + 1));

            if (data >= 10 && data <= 26) {
                int tmp = data % 10 == 0 ? first : first + second;

                first = second;
                second = tmp;
            }
            else if (data % 10 == 0) return 0;
            else first = second;
        }

        return second;
    }


}

