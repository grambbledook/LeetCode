package com.github.grambbledook.kotlin.task208

import com.github.grambbledook.java.task208.Trie
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TrieTest {


    val trie = Trie()

    @Test
    fun `test case 1`() {
        trie.insert("apple")
        assertContainsExact("apple")
        assertNotContainsExact("app")
        assertContainsPrefix("app")

        trie.insert("app")
        assertContainsExact("app")
    }

    @Test
    fun `test case 2`() {
        trie.insert("prefix")
//        assertContainsExact("apple")
//        assertNotContainsExact("app")
//        assertContainsPrefix("app")
//
//        trie.insert("app")
//        assertContainsExact("app")
    }

    private fun assertContainsExact(s: String) {
        Assertions.assertTrue(trie.search(s))
    }

    private fun assertNotContainsExact(s: String) {
        Assertions.assertFalse(trie.search(s))
    }

    private fun assertContainsPrefix(s: String) {
        Assertions.assertTrue(trie.startsWith(s))
    }

}