package com.github.grambbledook.kotlin.task621

import com.github.grambbledook.java.task621.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TaskSchedulerTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val input = charArrayOf('A', 'A', 'A', 'B', 'B', 'B')
        val result = test.leastInterval(input, 2)

        Assertions.assertEquals(8, result)
    }

    @Test
    fun `test case 2`() {
        val input = charArrayOf('A', 'A', 'A', 'B', 'B', 'B')
        val result = test.leastInterval(input, 0)

        Assertions.assertEquals(6, result)
    }

    @Test
    fun `test case 3`() {
        val input = charArrayOf('A', 'A', 'A', 'B', 'B', 'B')
        val result = test.leastInterval(input, 1)

        Assertions.assertEquals(6, result)
    }

    @Test
    fun `test case 4`() {
        val input = charArrayOf('A', 'B', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E')
        val result = test.leastInterval(input, 4)

        Assertions.assertEquals(10, result)
    }

    @Test
    fun `test case 5`() {
        val input = charArrayOf('A', 'A', 'A', 'B', 'B', 'B')
        val result = test.leastInterval(input, 50)

        Assertions.assertEquals(104, result)
    }

}