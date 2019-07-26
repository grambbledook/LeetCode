package com.github.grambbledook.kotlin.task46

import com.github.grambbledook.java.task46.recursive.Permutations
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream
import com.github.grambbledook.java.task46.recursive.Solution as RecursiveExtraSpace
import com.github.grambbledook.java.task46.recursive.inplace.Solution as RecursiveInPlace

class PermutationsTest {

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 1`(test: Permutations) {
        val expected = mutableListOf(listOf(1, 2), listOf(2, 1))

        test.doTest(intArrayOf(1, 2), expected)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 2`(test: Permutations) {
        val expected = mutableListOf(listOf(1, 2, 3), listOf(1, 3, 2), listOf(2, 1, 3), listOf(2, 3, 1), listOf(3, 1, 2), listOf(3, 2, 1))

        test.doTest(intArrayOf(1, 2, 3), expected)
    }

    private fun Permutations.doTest(input: IntArray, expected: MutableList<List<Int>>) {
        val result = permute(input)
        result.asSequence().forEach { expected.remove(it) }
        Assertions.assertTrue(expected.isEmpty(), "Remaining elements: $expected")
    }

}


class Args : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> =
            Stream.of(
                    Arguments.of(RecursiveExtraSpace()),
                    Arguments.of(RecursiveInPlace())
            )
}