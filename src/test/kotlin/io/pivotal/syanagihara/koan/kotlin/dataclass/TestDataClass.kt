package io.pivotal.syanagihara.koan.kotlin.dataclass

import org.junit.Assert
import org.junit.Test

class HelloWorld {
    @Test
    fun testDataClass() {
        Assert.assertEquals("Bob", getPeople()[1].name)
        Assert.assertEquals(31, getPeople()[1].age)
    }
}