package com.github.grambbledook.atcoder.h

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class AtcoderHTest {

    @Test
    fun `test case 1`() {
        val input = listOf(
                "...#",
                ".#..",
                "...."
        ).map { it.toCharArray() }
                .toTypedArray()

        val result = countPath(input, 3, 4)
        Assertions.assertEquals(3, result)
    }

    @Test
    fun `test case 2`() {
        val input = listOf(
                "..",
                "#.",
                "..",
                ".#",
                ".."
        ).map { it.toCharArray() }
                .toTypedArray()

        val result = countPath(input, 5, 2)
        Assertions.assertEquals(0, result)
    }

    @Test
    fun `test case 3`() {
        val input = listOf(
                "....................",
                "....................",
                "....................",
                "....................",
                "....................",
                "....................",
                "....................",
                "....................",
                "....................",
                "....................",
                "....................",
                "....................",
                "....................",
                "....................",
                "....................",
                "....................",
                "....................",
                "....................",
                "....................",
                "...................."
        ).map { it.toCharArray() }
                .toTypedArray()

        val result = countPath(input, 20, 20)
        Assertions.assertEquals(345263555, result)
    }

    @Test
    fun `test case 4`() {
        val input = listOf(
                "..#..",
                ".....",
                "#...#",
                ".....",
                "..#.."
        ).map { it.toCharArray() }
                .toTypedArray()

        val result = countPath(input, 5, 5)
        Assertions.assertEquals(24, result)
    }

    @Test
    fun `test case 5`() {
        val input = listOf(
                ".....",
                "####.",
                "####.",
                "####.",
                "####."
        ).map { it.toCharArray() }
                .toTypedArray()

        val result = countPath(input, 5, 5)
        Assertions.assertEquals(1, result)
    }
}