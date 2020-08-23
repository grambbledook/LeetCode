package com.github.grambbledook.leetcode.task1528

class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        val str = s.toCharArray().toTypedArray()
        val idx = indices.toTypedArray()

        s.indices.forEach {
            while (idx[it] != it) {
                val next = idx[it]

                swap(it, next, idx)
                swap(it, next, str)
            }
        }

        return String(str.toCharArray())
    }

    fun <T> swap(l: Int, r: Int, arr: Array<T>) {
        val tmp = arr[l]
        arr[l] = arr[r]
        arr[r] = tmp
    }
}