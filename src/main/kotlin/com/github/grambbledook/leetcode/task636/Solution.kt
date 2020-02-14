package com.github.grambbledook.leetcode.task636

import java.util.*

class Solution {

    fun exclusiveTime(n: Int, funcs: List<String>): IntArray {
        val logs = funcs.asSequence()

        val (id, _, at) = logs.first().split(":")
        val stack = LinkedList<Int>().also {
            it.push(id.toInt())
        }


        var cycle = at.toInt()
        val result = IntArray(n)

        logs.forEach { log ->
            val data = log.split(":")
            val cycles = data[2].toInt() - cycle

            cycles.takeIf { it > 0 }?.also {
                result[stack.peek()] += it
                cycle += it
            }

            when (data[1]) {
                "start" ->
                    stack.push(data[0].toInt())
                else -> {
                    result[stack.peek()]++
                    stack.pop()
                    cycle++
                }
            }

        }

        return result
    }


}