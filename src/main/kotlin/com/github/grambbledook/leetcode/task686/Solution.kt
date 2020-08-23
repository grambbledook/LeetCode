package com.github.grambbledook.leetcode.task686

class Solution {
    fun repeatedStringMatch(A: String, B: String): Int {
        val sb = StringBuilder()

        var count = 0;
        while (sb.length < B.length) {
            sb.append(A)
            count++
        }

        return if (sb.contains(B)) count
        else if (sb.append(A).contains(B)) count + 1
        else -1
    }
}