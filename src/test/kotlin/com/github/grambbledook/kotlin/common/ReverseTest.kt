package com.github.grambbledook.kotlin.common

import com.github.grambbledook.java.common.Reverse
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.*
import java.util.stream.Stream

class ReverseTest {

    val test = object : Reverse {}

    @ParameterizedTest
    @ArgumentsSource(ReverseArgs::class)
    fun `Test Reverse Array`(input: IntArray, expected: IntArray) {
        test.test(input, expected)
    }

    @ParameterizedTest
    @ArgumentsSource(ReverseOffsetArgs::class)
    fun `Test Reverse Array offset`(input: IntArray, offset: Int, expected: IntArray) {
        test.testOffset(input, offset, expected)
    }


    fun Reverse.test(input: IntArray, expected: IntArray) {
        reverse(input)
        println(" Expected array ${Arrays.toString(expected)} Actual ${Arrays.toString(input)}")
        Assertions.assertArrayEquals(expected, input)
    }

    fun Reverse.testOffset(input: IntArray, offset: Int, expected: IntArray) {
        reverse(input, offset)
        println(" Expected array ${Arrays.toString(expected)} Actual ${Arrays.toString(input)}")
        Assertions.assertArrayEquals(expected, input)
    }
}


class ReverseArgs : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> =
            Stream.of(
                    Arguments.of(intArrayOf(1, 2, 3, 4, 5), intArrayOf(5, 4, 3, 2, 1)),
                    Arguments.of(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1)),
                    Arguments.of(intArrayOf(1, 2), intArrayOf(2, 1)),
                    Arguments.of(intArrayOf(1), intArrayOf(1))
            )
}

class ReverseOffsetArgs : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> =
            Stream.of(
                    Arguments.of(intArrayOf(1, 2, 3, 4, 5), 1, intArrayOf(1, 5, 4, 3, 2)),
                    Arguments.of(intArrayOf(1, 2, 3, 4, 5), 2, intArrayOf(1, 2, 5, 4, 3)),
                    Arguments.of(intArrayOf(1, 2, 3), 0, intArrayOf(3, 2, 1)),
                    Arguments.of(intArrayOf(1, 2, 3), 1, intArrayOf(1, 3, 2)),
                    Arguments.of(intArrayOf(1, 2), 0, intArrayOf(2, 1)),
                    Arguments.of(intArrayOf(1), 0, intArrayOf(1))
            )
}