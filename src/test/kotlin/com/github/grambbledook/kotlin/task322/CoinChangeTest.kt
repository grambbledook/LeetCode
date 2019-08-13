package com.github.grambbledook.kotlin.task322

import com.github.grambbledook.java.task322.CoinChange
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream
import com.github.grambbledook.java.task322.Solution as DP
import com.github.grambbledook.java.task322.brute.Solution as Brute
import com.github.grambbledook.java.task322.memo.Solution as Memo

class CoinChangeTest {

    @ParameterizedTest
    @ArgumentsSource(CoinChangeArgs::class)
    fun `test case 1`(test: CoinChange) {
        val result = test.coinChange(intArrayOf(1, 2, 5), 11)
        Assertions.assertEquals(3, result)
    }

    @ParameterizedTest
    @ArgumentsSource(CoinChangeArgs::class)
    fun `test case 2`(test: CoinChange) {
        val result = test.coinChange(intArrayOf(2), 1)
        Assertions.assertEquals(-1, result)
    }

    @ParameterizedTest
    @ArgumentsSource(CoinChangeArgs::class)
    fun `test case 3`(test: CoinChange) {
        val result = test.coinChange(intArrayOf(2, 5, 10, 1), 4)
        Assertions.assertEquals(2, result)
    }

//    @Disabled
    @ParameterizedTest
    @ArgumentsSource(CoinChangeArgs::class)
    fun `test case 4`(test: CoinChange) {
        val result = test.coinChange(intArrayOf(186, 419, 83, 408), 6249)
        Assertions.assertEquals(20, result)
    }

}

class CoinChangeArgs : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
        return Stream.of(
                Arguments.of(DP()),
                Arguments.of(Memo())
                //,
//                Arguments.of(Brute())
        )
    }
}