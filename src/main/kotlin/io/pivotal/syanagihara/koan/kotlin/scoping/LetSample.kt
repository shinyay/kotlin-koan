package io.pivotal.syanagihara.koan.kotlin.scoping

fun sampleLet(): String {
    val foo: Person = Person("let", 20)

    return foo.let { it ->
        println(it)
        it.defineHobby("Kotlin")
        println(it.toStringAddon())
        it.displayHobby()
    }
}