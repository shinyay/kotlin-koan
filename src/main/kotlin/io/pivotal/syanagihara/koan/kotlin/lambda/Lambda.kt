package io.pivotal.syanagihara.koan.kotlin.lambda

fun containsEven(collection: Collection<Int>): Boolean = collection.any { it -> it % 2 == 0}