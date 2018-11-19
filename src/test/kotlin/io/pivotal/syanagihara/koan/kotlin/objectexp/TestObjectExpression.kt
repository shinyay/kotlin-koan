package io.pivotal.syanagihara.koan.kotlin.objectexp

import org.junit.Assert.assertEquals
import org.junit.Test

class TestObjectExpression {

    @Test
    fun testSort() {
        assertEquals(listOf(5, 2, 1), getList())
    }

    @Test
    fun testSortLambda() {
        assertEquals(listOf(5, 2, 1), getListLambda())
    }

    @Test
    fun testSortLambdaRefined() {
        assertEquals(listOf(5, 2, 1), getListLambdaRefined())
    }
}