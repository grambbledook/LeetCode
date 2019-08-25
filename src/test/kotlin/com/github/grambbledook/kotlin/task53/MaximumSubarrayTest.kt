package com.github.grambbledook.kotlin.task53

import com.github.grambbledook.java.task53.MaxSubarray
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream
import com.github.grambbledook.java.task53.Solution as Plain
import com.github.grambbledook.java.task53.dp.Solution as DynamicProgramming
import com.github.grambbledook.java.task53.dc.Solution as DivideAndConquer

class MaximumSubarrayTest {

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 1`(test: MaxSubarray) {
        val input = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)

        val result = test.maxSubArray(input)
        Assertions.assertEquals(6, result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 2`(test: MaxSubarray) {
        val input = intArrayOf(-1)

        val result = test.maxSubArray(input)
        Assertions.assertEquals(-1, result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 3`(test: MaxSubarray) {
        val input = intArrayOf(-2, -1)

        val result = test.maxSubArray(input)
        Assertions.assertEquals(-1, result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 4`(test: MaxSubarray) {
        val input = intArrayOf(1, 2)

        val result = test.maxSubArray(input)
        Assertions.assertEquals(3, result)
    }

}

class Args : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
        return Stream.of(
                Arguments.of(DynamicProgramming()),
                Arguments.of(DivideAndConquer()),
                Arguments.of(Plain())
        )
    }
}