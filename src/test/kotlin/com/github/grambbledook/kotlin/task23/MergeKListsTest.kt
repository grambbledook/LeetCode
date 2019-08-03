package com.github.grambbledook.kotlin.task23

import com.github.grambbledook.java.task23.MergeKLists
import com.github.grambbledook.java.task23.brute.Solution as HeapMerge
import com.github.grambbledook.java.task23.Solution as PairwiseMerge
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

class MergeKListsTest {

    @ParameterizedTest
    @ArgumentsSource(KListsArgs::class)
    fun `Test case 1`(test: MergeKLists) {
        val lists = arrayOf(
                arrayOf(-10, -9, -9, -3, -1, -1, 0),
                arrayOf(-5), arrayOf(4), arrayOf(-8), arrayOf(),
                arrayOf(-9, -6, -5, -4, -2, 2, 3), arrayOf(-3, -3, -2, -1, 0)
        )
        
        val result = test.mergeKLists(buildLists(lists))

        assertListsEqual(result, merge(lists))
    }

    @ParameterizedTest
    @ArgumentsSource(KListsArgs::class)
    fun `Test case 2`(test: MergeKLists) {
        val lists = arrayOf(
                arrayOf(1, 2, 3),
                arrayOf(4, 5, 6, 7)
        )

        val result = test.mergeKLists(buildLists(lists))

        assertListsEqual(result, merge(lists))
    }

    @ParameterizedTest
    @ArgumentsSource(KListsArgs::class)
    fun `Test case 3`(test: MergeKLists) {
        val lists = arrayOf(
                arrayOf(1, 4, 5),
                arrayOf(1, 3, 4),
                arrayOf(2, 6)
        )

        val result = test.mergeKLists(buildLists(lists))

        assertListsEqual(result, merge(lists))
    }

    private fun assertListsEqual(result: MergeKLists.ListNode, merge: List<Int>) {
        var current: MergeKLists.ListNode? = result

        val message = "Expected \n$merge\n Actual \n${buildList(result)}"

        merge.forEach {
            assertEquals(current?.`val`, it, message)
            current = current?.next
        }

        assertNull(current)
    }

    private fun buildList(result: MergeKLists.ListNode): String {
        val bldr = StringBuilder()
                .append("(")
                .append(result.`val`)

        var node: MergeKLists.ListNode? = result.next

        while (node != null) {
            bldr.append(", ")
            bldr.append(node.`val`)
            node = node.next
        }

        return bldr.append(")").toString()
    }


    private fun merge(lists: Array<Array<Int>>): List<Int> {
        return lists.flatten().sorted()
    }

    private fun buildLists(lists: Array<Array<Int>>): Array<out MergeKLists.ListNode>? {
        return lists.map {
            it.map { MergeKLists.ListNode(it) }
        }.filter {
            it.isNotEmpty()
        }.map {
            it.reduceRight { listNode, acc -> listNode.next = acc; listNode }
        }.toTypedArray()
    }
}

class KListsArgs : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
        return Stream.of(
                Arguments.of(HeapMerge()),
                Arguments.of(PairwiseMerge())
        )
    }
}