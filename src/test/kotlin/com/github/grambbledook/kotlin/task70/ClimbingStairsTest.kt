package com.github.grambbledook.kotlin.task70

import com.github.grambbledook.java.task70.ClimbingStairs
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream
import com.github.grambbledook.java.task70.Solution as DP
import com.github.grambbledook.java.task70.memo.Solution as Memo

class ClimbingStairsTest {

    @ParameterizedTest
    @ArgumentsSource(ClimbingStairsArgs::class)
    fun `test case 1`(test: ClimbingStairs) {
        val result = test.climbStairs(1)
        Assertions.assertEquals(1, result)
    }

    @ParameterizedTest
    @ArgumentsSource(ClimbingStairsArgs::class)
    fun `test case 2`(test: ClimbingStairs) {
        val result = test.climbStairs(2)
        Assertions.assertEquals(2, result)
    }

    @ParameterizedTest
    @ArgumentsSource(ClimbingStairsArgs::class)
    fun `test case 3`(test: ClimbingStairs) {
        val result = test.climbStairs(3)
        Assertions.assertEquals(3, result)
    }

    @ParameterizedTest
    @ArgumentsSource(ClimbingStairsArgs::class)
    fun `test case 4`(test: ClimbingStairs) {
        val result = test.climbStairs(4)
        Assertions.assertEquals(5, result)
    }

    @ParameterizedTest
    @ArgumentsSource(ClimbingStairsArgs::class)
    fun `test case 5`(test: ClimbingStairs) {
        val result = test.climbStairs(5)
        Assertions.assertEquals(8, result)
    }

    @ParameterizedTest
    @ArgumentsSource(ClimbingStairsArgs::class)
    fun `test case 6`(test: ClimbingStairs) {
        val result = test.climbStairs(6)
        Assertions.assertEquals(13, result)
    }

    @ParameterizedTest
    @ArgumentsSource(ClimbingStairsArgs::class)
    fun `test case 7`(test: ClimbingStairs) {
        val result = test.climbStairs(44)
        Assertions.assertEquals(1134903170, result)
    }
}

class ClimbingStairsArgs : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
        return Stream.of(
            Arguments.of(DP()),
            Arguments.of(Memo())
        )
    }
}