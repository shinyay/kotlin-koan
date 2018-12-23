package io.pivotal.syanagihara.koan.kotlin.scoping

fun  sampleWith() : Int {
    val foo: Person = Person("with", 20)

    with(foo){
        println(foo)
        foo.increaseAge()
        println(foo)
    }

    return foo.age
}