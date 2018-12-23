package io.pivotal.syanagihara.koan.kotlin.scoping

fun  sampleRun(): String {
    val foo: Person = Person("run", 20)

    return foo.run {
        println(this)
        nameToUpperCase()
        println(this)
        this.name
    }
}