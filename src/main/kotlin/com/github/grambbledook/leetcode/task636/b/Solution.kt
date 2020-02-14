package com.github.grambbledook.leetcode.task636.b

import java.util.*


class Solution {

    fun exclusiveTime(n: Int, funcs: List<String>): IntArray {
        val logs = funcs.asSequence()

        val (a, _, c) = funcs.first().split()

        val stack = LinkedList<Int>().also {
            it.push(a)
        }

        var prev = c
        val result = IntArray(n)
        logs.forEach { log ->
            val (id, type, current) = log.split()

            when (type) {
                "start" -> {
                    if (stack.isNotEmpty())
                        result[stack.peek()] += current - prev

                    stack.push(id)
                    prev = current
                }
                else -> {
                    result[stack.peek()] += current - prev + 1
                    prev = current + 1
                    stack.pop()
                }
            }
        }
        return result
    }

    private fun String.split(): Triple<Int, String, Int> {
        val (a, b, c) = split(":")
        return Triple(a.toInt(), b, c.toInt())
    }

}