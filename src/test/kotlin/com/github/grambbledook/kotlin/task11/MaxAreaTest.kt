package com.github.grambbledook.kotlin.task11

import com.github.grambbledook.java.task11.Solution as MaxAreaOptimal
import com.github.grambbledook.java.task11.brute.Solution as MaxAreaBrute


import com.github.grambbledook.java.task11.MaxArea
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

class MaxAreaTest {

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 1`(test: MaxArea) {
        val result = test.maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7))
        Assertions.assertEquals(49, result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 2`(test: MaxArea) {
        val result = test.maxArea(intArrayOf(1, 2, 4, 3))
        Assertions.assertEquals(4, result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 3`(test: MaxArea) {
        val result = test.maxArea(intArrayOf(1, 1))
        Assertions.assertEquals(1, result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 4`(test: MaxArea) {
        val result = test.maxArea(intArrayOf(1, 2))
        Assertions.assertEquals(1, result)
    }

}


class Args : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> =
            Stream.of(
                    Arguments.of(MaxAreaOptimal()),
                    Arguments.of(MaxAreaBrute())
            )
}