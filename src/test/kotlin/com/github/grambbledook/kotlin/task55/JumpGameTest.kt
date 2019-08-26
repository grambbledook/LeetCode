package com.github.grambbledook.kotlin.task55

import com.github.grambbledook.java.task55.JumpGame
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream
import com.github.grambbledook.java.task55.dp.Solution as Memo
import com.github.grambbledook.java.task55.Solution as Greedy

class JumpGameTest {

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 1`(test: JumpGame) {
        val input = intArrayOf(2, 3, 1, 1, 4)

        val result = test.canJump(input)
        Assertions.assertTrue(result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 2`(test: JumpGame) {
        val input = intArrayOf(3, 2, 1, 0, 4)

        val result = test.canJump(input)
        Assertions.assertFalse(result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 3`(test: JumpGame) {
        val input = intArrayOf(0)

        val result = test.canJump(input)
        Assertions.assertTrue(result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 4`(test: JumpGame) {
        val input = intArrayOf(2, 0)

        val result = test.canJump(input)
        Assertions.assertTrue(result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 5`(test: JumpGame) {
        val input = intArrayOf(2, 0, 0)

        val result = test.canJump(input)
        Assertions.assertTrue(result)
    }

}

class Args : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
        return Stream.of(
                Arguments.of(Memo()),
                Arguments.of(Greedy())
        )
    }
}