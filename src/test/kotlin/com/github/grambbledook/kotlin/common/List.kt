package com.github.grambbledook.kotlin.common

import com.github.grambbledook.java.common.ListNode

fun list(vararg value: Int): ListNode {
    val head = ListNode(0)
    value.map { ListNode(it) }.fold(head) { acc, node ->
        acc.next = node
        node
    }
    return head.next

}

fun ListNode.toIntArray(): IntArray {
    var node: ListNode? = this

    val list = mutableListOf<Int>()
    while (node != null) {
        list.add(node.`val`)
        node = node.next
    }

    return list.toIntArray()
}