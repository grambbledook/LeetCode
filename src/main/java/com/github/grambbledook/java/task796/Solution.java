package com.github.grambbledook.java.task796;

public class Solution {

    public boolean rotateString(String A, String B) {
        if (A == null || B == null || A.length() != B.length()) return false;

        return (A + A).contains(B);
    }

}
