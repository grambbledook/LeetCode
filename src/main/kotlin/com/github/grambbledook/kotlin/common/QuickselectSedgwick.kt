package com.github.grambbledook.kotlin.common


object QuickselectSedgwick {

    fun select(a: IntArray, k: Int): Int {
        var lo = 0
        var hi = a.size - 1
        while (hi > lo) {
            val i = partition(a, lo, hi)
            if (i > k)
                hi = i - 1
            else if (i < k)
                lo = i + 1
            else
                return a[i]
        }
        return a[lo]
    }

    private fun partition(a: IntArray, lo: Int, hi: Int): Int {
        var i = lo
        var j = hi + 1
        val v = a[lo]

        while (true) {
            while ((a[++i] >= v)) {
                if (i == hi) break
            }

            while ((v >= a[--j])) {
                if (j == lo) break      // redundant since a[lo] acts as sentinel
            }

            if (i >= j) break
            swap(a, i, j)
        }

        swap(a, lo, j)
        return j
    }

}