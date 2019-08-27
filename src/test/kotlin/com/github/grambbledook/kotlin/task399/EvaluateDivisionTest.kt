package com.github.grambbledook.kotlin.task399

import com.github.grambbledook.java.task399.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

class EvaluateDivisionTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val equations = listOf(listOf("a", "b"))
        val values = doubleArrayOf(2.0)
        val queries = listOf(listOf("a", "a"))

        val result = test.calcEquation(equations, values, queries)

        Assertions.assertArrayEquals(doubleArrayOf(1.0), result)
    }

    @Test
    fun `test case 2`() {
        val equations = listOf(listOf("a", "b"))
        val values = doubleArrayOf(2.0)
        val queries = listOf(listOf("b", "a"))

        val result = test.calcEquation(equations, values, queries)

        Assertions.assertArrayEquals(doubleArrayOf(0.5), result)
    }

    @Test
    fun `test case 3`() {
        val equations = listOf(listOf("a", "b"), listOf("b", "c"))
        val values = doubleArrayOf(2.0, 3.0)
        val queries = listOf(listOf("a", "c"))

        val result = test.calcEquation(equations, values, queries)

        Assertions.assertArrayEquals(doubleArrayOf(6.0), result)
    }

    @Test
    fun `test case 4`() {
        val equations = listOf(listOf("a", "b"), listOf("c", "d"), listOf("e", "f"), listOf("g", "h"))
        val values = doubleArrayOf(4.5, 2.3, 8.9, 0.44)
        val queries = listOf(
                listOf("a", "c"),
                listOf("d", "f"),
                listOf("h", "e"),
                listOf("b", "e"),
                listOf("d", "h"),
                listOf("g", "f"),
                listOf("c", "g")
        )

        val result = test.calcEquation(equations, values, queries)

        Assertions.assertArrayEquals(doubleArrayOf(-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0), result, Arrays.toString(result))
    }


    @Test
    fun `test case 5`() {
        val equations = listOf(listOf("a", "b"), listOf("b", "c"))
        val values = doubleArrayOf(2.0, 3.0)
        val queries = listOf(
                listOf("a", "c"),
                listOf("b", "a"),
                listOf("a", "e"),
                listOf("a", "a"),
                listOf("x", "x")
        )

        val result = test.calcEquation(equations, values, queries)

        Assertions.assertArrayEquals(doubleArrayOf(6.0, 0.5, -1.0, 1.0, -1.0), result)
    }

    @Test
    fun `test case 6`() {
        val equations = listOf(listOf("a", "b"), listOf("b", "c"), listOf("c", "d"), listOf("d", "e"))
        val values = doubleArrayOf(3.0, 4.0, 5.0, 6.0)
        val queries = listOf(
                listOf("a", "e"),
                listOf("e", "b"),
                listOf("b", "d"),
                listOf("b", "b"),
                listOf("b", "g"),
                listOf("g", "g")
        )

        val result = test.calcEquation(equations, values, queries)

        doubleArrayOf(360.0, 0.00833, 20.0, 1.0, -1.0, -1.0).forEachIndexed { index, expected ->
            Assertions.assertEquals(expected, result[index], 0.000005)
        }
    }


    @Test
    fun `test case 7`() {
        val equations = listOf(listOf("a", "b"), listOf("b", "c"), listOf("a", "d"), listOf("b", "e"))
        val values = doubleArrayOf(3.0, 0.5, 3.4, 5.6)
        val queries = listOf(
                listOf("b", "d"),
                listOf("a", "e"),
                listOf("a", "c"),
                listOf("e", "e"),
                listOf("e", "a"),
                listOf("c", "d"),
                listOf("d", "c"),
                listOf("f", "f"),
                listOf("z", "z")
        )

        val result = test.calcEquation(equations, values, queries)

        doubleArrayOf(1.13333, 16.8, 1.5, 1.0, 0.05952, 2.26667, 0.44118, -1.0, -1.0).forEachIndexed { index, expected ->
            Assertions.assertEquals(expected, result[index], 0.000005)
        }
    }
}