package io.pivotal.syanagihara.koan.kotlin.scoping

fun sampleAlso(): Person {
    val foo: Person = Person("also", 20)

    return foo.also { it ->
        println(it)
        it.nameToUpperCase()
        it.increaseAge()
        it.defineHobby("Kotlin")
        println(it.toStringAddon())
    }
}