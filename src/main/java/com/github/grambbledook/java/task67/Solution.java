package com.github.grambbledook.java.task67;

public class Solution {

    private boolean flag;
    private StringBuilder sb = new StringBuilder();

    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;

        for (; i >= 0 && j >= 0; i--, j--) {
            char l = a.charAt(i);
            char r = b.charAt(j);

            if (l != r) sb.append(flag ? 0 : 1);
            else if (l == '0') {
                sb.append(flag ? 1 : 0);
                flag = false;
            } else {
                sb.append(flag ? 1 : 0);
                flag = true;
            }
        }

        remaining(a, i);
        remaining(b, j);

        if (flag) sb.append(1);

        return sb.reverse().toString();
    }

    private void remaining(String string, int idx) {
        while (idx >= 0) {
            char c = string.charAt(idx--);

            if (c == '1') sb.append(flag ? 0 : 1);
            else {
                sb.append(flag ? 1 : 0);
                flag = false;
            }
        }
    }

}
