package io.pivotal.syanagihara.koan.kotlin.`object`

import io.pivotal.syanagihara.koan.kotlin.objectexp.getList
import org.junit.Assert.assertEquals
import org.junit.Test

class TestObjectExpression {

    @Test
    fun testSort() {
        assertEquals(listOf(5, 2, 1), getList())
    }
}