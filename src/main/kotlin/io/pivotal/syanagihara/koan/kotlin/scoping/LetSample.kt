package io.pivotal.syanagihara.koan.kotlin.scoping

fun sampleLet(): String {
    val foo: Person = Person("let", 20)

    return foo.let { it ->
        it.defineHobby("Kotlin")
        println(it)
        it.displayHobby()
    }
}