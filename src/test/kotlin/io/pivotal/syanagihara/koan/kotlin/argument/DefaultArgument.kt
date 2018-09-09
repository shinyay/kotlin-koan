package io.pivotal.syanagihara.koan.kotlin.argument

import org.junit.Assert
import org.junit.Test

class TestDefaultArgument {

    @Test
    fun testDefaultAndNamedParams() {
        Assert.assertEquals(listOf("a1", "b2", "C1", "D4"), DefaultArgument().useFoo())
    }
}