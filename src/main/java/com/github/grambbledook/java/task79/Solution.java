package com.github.grambbledook.java.task79;


public class Solution {

    private int n;
    private int m;

    private char[] word;
    private char[][] board;
    private boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        prepare(board, word);
        return start();
    }

    private void prepare(char[][] board, String word) {
        this.n = board.length;
        this.m = board[0].length;

        this.board = board;
        this.word = word.toCharArray();
        this.visited = new boolean[n][m];
    }

    private boolean start() {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word[0]) {
                    if (search(i, j, 1, true)) return true;
                }
            }
        }

        return false;
    }

    private boolean search(int i, int j, int offset, boolean start) {
        if (offset == word.length) return !visited[i][j] || start;

        visited[i][j] = true;
        boolean exists = isExists(i > 0, i - 1, j, offset)
                || isExists(j > 0, i, j - 1, offset)
                || isExists(i < n - 1, i + 1, j, offset)
                || isExists(j < m - 1, i, j + 1, offset);

        visited[i][j] = false;
        return exists;
    }

    private boolean isExists(boolean condition, int i, int j, int offset) {
        if (condition && !visited[i][j] && board[i][j] == word[offset]) {
            return search(i, j, offset + 1, false);
        }

        return false;
    }

}