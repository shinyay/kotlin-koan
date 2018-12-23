package io.pivotal.syanagihara.koan.kotlin.scoping

import java.util.*

fun sampleApply(): String {
    val foo: Person = Person("apply", 20)

    foo.apply {
        println(this)
        nameToUpperCase()
        increaseAge()
        println(this)
    }

    return foo.toString()
}