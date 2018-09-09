package io.pivotal.syanagihara.koan.kotlin.argument

class DefaultArgument {

/*
* In the case of Java, it needs some overload methods
*
public String foo(String name, int number, boolean toUpperCase) {
    return (toUpperCase ? name.toUpperCase() : name) + number;
}
public String foo(String name, int number) {
    return foo(name, number, false);
}
public String foo(String name, boolean toUpperCase) {
    return foo(name, 1, toUpperCase);
}
public String foo(String name) {
    return foo(name, 1);
}
*/

    fun foo(name: String, number: Int = 1, toUpperCase: Boolean = false) =
            (if (toUpperCase) name.toUpperCase() else name) + number

    fun useFoo() = listOf(
            foo("a"),
            foo("b", number = 2),
            foo("c", toUpperCase = true),
            foo("d", number = 4, toUpperCase = true)
    )
}