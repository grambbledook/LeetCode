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