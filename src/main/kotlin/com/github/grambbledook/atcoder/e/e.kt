package com.github.grambbledook.atcoder.e


import java.util.*


fun calculate(n: Int, weight: Int, w: LongArray, v: LongArray): Long {
    val dp = Array(n + 1) { LongArray(weight + 1) { -1 } }

    fun go(n: Int, weight: Int): Long {
        if (dp[n][weight] != -1L) return dp[n][weight]

        val result = if (n == 0 || weight == 0) {
            0
        } else if (w[n - 1] > weight) {
            go(n - 1, weight)
        } else {
            val no = go(n - 1, weight)
            val yes = v[n - 1] + go(n - 1, (weight - w[n - 1]).toInt())

            Math.max(no, yes)
        }

        dp[n][weight] = result
        return result
    }

    return go(n, weight)
}

fun main() {
    val result = with(Scanner(System.`in`)) {
        val n = nextInt()
        val W = nextInt()

        val w = mutableListOf<Long>()
        val v = mutableListOf<Long>()

        for (i in 0 until n) {
            w.add(nextLong())
            v.add(nextLong())
        }

        calculate(n = n, weight = W, w = w.toLongArray(), v = v.toLongArray())
    }

    println(result)

}