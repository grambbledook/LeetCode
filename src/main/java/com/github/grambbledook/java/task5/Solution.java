package com.github.grambbledook.java.task5;


public class Solution {

    public int palindromize(String s) {
        int l = 0;
        int r = s.length() - 1;

        int candidateLeft = -1;
        int candidateRight = -1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {

                if (candidateLeft == -1) {
                    candidateLeft = l;
                    r++;
                } else if (candidateRight == -1) {
                    candidateRight = r;
                    l -= 2;
                } else return -1;

            }

            l++;
            r--;
        }

        return Math.max(candidateLeft, candidateRight);
    }

}