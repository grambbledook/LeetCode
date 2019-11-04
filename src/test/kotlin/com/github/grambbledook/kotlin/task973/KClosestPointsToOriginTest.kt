package com.github.grambbledook.kotlin.task973

import com.github.grambbledook.java.task973.FindClosest
import com.github.grambbledook.java.task973.Solution as Recursive
import com.github.grambbledook.java.task973.iterative.Solution as Iterative
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream
import org.junit.jupiter.params.provider.ArgumentsProvider

class KClosestPointsToOriginTest {
    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 1`(test: FindClosest) {
        val result = test.kClosest(arrayOf(intArrayOf(1, 3), intArrayOf(-2, 2)), 1)

        Assertions.assertArrayEquals(result, arrayOf(intArrayOf(-2, 2)))
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 2`(test: FindClosest) {
        val result = test.kClosest(arrayOf(intArrayOf(3, 3), intArrayOf(5, -1), intArrayOf(-2, 4)), 2)

        Assertions.assertArrayEquals(result, arrayOf(intArrayOf(3, 3), intArrayOf(-2, 4)))
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 3`(test: FindClosest) {
        val result = test.kClosest(
                arrayOf(intArrayOf(2, 2), intArrayOf(2, 2), intArrayOf(2, 2),
                        intArrayOf(2, 2), intArrayOf(2, 2), intArrayOf(2, 2), intArrayOf(1, 1)),
                1)

        Assertions.assertArrayEquals(result, arrayOf(intArrayOf(1, 1)))
    }


    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 4`(test: FindClosest) {
        val result = test.kClosest(arrayOf(intArrayOf(1, 3), intArrayOf(-2, 2), intArrayOf(2, -2)), 2)

        Assertions.assertArrayEquals(result, arrayOf(intArrayOf(2, -2), intArrayOf(-2, 2)))
    }
}

class Args : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
        return Stream.of(
                Arguments.of(Recursive()),
                Arguments.of(Iterative())
        )
    }
}