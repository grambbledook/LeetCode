package com.github.grambbledook.kotlin.task146

import com.github.grambbledook.java.task146.LRUCache
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LURCacheTest {

    @Test
    fun `test case 1`() {
        val cache = LRUCache(2)

        cache.put(1, 1)
        cache.put(2, 2)
        Assertions.assertEquals(1, cache.get(1))

        cache.put(3, 3)
        Assertions.assertEquals(-1, cache.get(2))

        cache.put(4, 4)
        Assertions.assertEquals(-1, cache.get(1))
        Assertions.assertEquals(3, cache.get(3))
        Assertions.assertEquals(4, cache.get(4))
    }

    @Test
    fun `test case 2`() {
        val cache = LRUCache(2)

        Assertions.assertEquals(-1, cache.get(2))

        cache.put(2, 6)
        Assertions.assertEquals(-1, cache.get(1))

        cache.put(1, 5)
        cache.put(1, 2)
        Assertions.assertEquals(2, cache.get(1))
        Assertions.assertEquals(6, cache.get(2))
    }

}