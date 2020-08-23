package com.github.grambbledook.leetcode.task929

class Solution {
    fun numUniqueEmails(emails: Array<String>): Int {
        return emails.map {
            it.split("@")
        }.map { (local, domain) ->
            val offset = local.indexOf('+')
            val tagIndex = if (offset == -1) local.length else offset

            Pair(local.substring(0, tagIndex).replace(".", ""), domain)
        }.distinct().size
    }
}