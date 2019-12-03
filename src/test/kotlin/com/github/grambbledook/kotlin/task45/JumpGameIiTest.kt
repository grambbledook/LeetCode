package com.github.grambbledook.kotlin.task45

import com.github.grambbledook.java.task45.JumpGame2
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream
import com.github.grambbledook.java.task45.Solution as Brute
import com.github.grambbledook.java.task45.dp.Solution as DP
import com.github.grambbledook.java.task45.greedy.Solution as Greedy

class JumpGameIiTest {

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 1`(test: JumpGame2) {
        val result = test.jump(intArrayOf(2, 3, 1, 1, 4))

        Assertions.assertEquals(2, result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 2`(test: JumpGame2) {
        val result = test.jump(intArrayOf(2, 3, 0, 1, 4))

        Assertions.assertEquals(2, result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 3`(test: JumpGame2) {
        val result = test.jump(intArrayOf(5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0))

        Assertions.assertEquals(3, result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 4`(test: JumpGame2) {
        val result = test.jump(intArrayOf(5))

        Assertions.assertEquals(0, result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 5`(test: JumpGame2) {
        val result = test.jump(intArrayOf(4, 3, 2, 2, 0, 1, 9))

        Assertions.assertEquals(3, result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 6`(test: JumpGame2) {
        val result = test.jump(intArrayOf(1, 0, 0, 0))

        Assertions.assertEquals(-1, result)
    }

}

class Args : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
        return Stream.of(
                Arguments.of(Brute()),
                Arguments.of(DP()),
                Arguments.of(Greedy())
        )
    }
}