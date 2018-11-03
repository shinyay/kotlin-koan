package io.pivotal.syanagihara.koan.kotlin.extension

import org.junit.Assert
import org.junit.Test

class TestExtensionFunctions() {
    @Test
    fun testIntExtension() {
        Assert.assertEquals("Rational number creation error: ",
                RationalNumber(4, 1), 4.r())
    }

    @Test fun testPairExtension() {
        Assert.assertEquals("Rational number creation error: ",
                RationalNumber(2, 3), Pair(2, 3).r())
    }
}