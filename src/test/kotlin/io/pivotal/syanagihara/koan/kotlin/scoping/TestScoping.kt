package io.pivotal.syanagihara.koan.kotlin.scoping

import org.junit.Assert
import org.junit.Test

class TestScoping {

    @Test
    fun withTest() {
        Assert.assertEquals(21, sampleWith())
    }

    @Test
    fun runTest() {
        Assert.assertEquals("RUN", sampleRun())
    }

    @Test
    fun letTest() {
        Assert.assertEquals("Kotlin", sampleLet())
    }

    @Test
    fun apply() {
        Assert.assertEquals("Person(name=APPLY, age=21)", sampleApply())
    }
}