package io.pivotal.syanagihara.koan.kotlin.objectexp

import java.util.*
import kotlin.Comparator

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object : Comparator<Int> {
        override fun compare(x: Int, y: Int) = y - x
    })
    return arrayList
}

fun getListLambda(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList) { x, y -> y - x }
    return arrayList
}

fun getListLambdaRefined(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    arrayList.sortWith(Comparator { x, y -> y - x })
    return arrayList
}