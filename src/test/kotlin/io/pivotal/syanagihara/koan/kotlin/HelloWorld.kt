package io.pivotal.syanagihara.koan.kotlin

import org.junit.Assert
import org.junit.Test

class HelloWorld {
    @Test fun testOk() {
        Assert.assertEquals("OK", start())
    }
}