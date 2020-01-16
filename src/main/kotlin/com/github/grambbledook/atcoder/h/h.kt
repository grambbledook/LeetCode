package com.github.grambbledook.atcoder.h

import java.util.*

const val mod = 1000000007

fun countPath(matrix: Array<CharArray>, h: Int, w: Int): Int {
    val dp = Array(h) { IntArray(w) }
            .also { it[0][0] = 1 }

    for (i in 0 until h) {
        for (j in 0 until w) {
            if (matrix[i][j] == '#') continue
            if (i >= 1) dp[i][j] = (dp[i - 1][j] + dp[i][j]) % mod
            if (j >= 1) dp[i][j] = (dp[i][j - 1] + dp[i][j]) % mod

        }
    }
    return dp[h - 1][w - 1]
}

fun main(args: Array<String>) {
    val result = with(Scanner(System.`in`)) {
        val (h, w) = nextLine().split(' ').map { it.toInt() }

        val list = mutableListOf<CharArray>()

        for (i in 0 until h) {
            val row = nextLine()
                    .toCharArray()

            list.add(row)
        }

        countPath(list.toTypedArray(), h, w)
    }

    println(result)
}
