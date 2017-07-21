package com.pfariasmunoz.kotlincourse.nulls

fun main(args: Array<String>) {

    val message: String = "My message"

    // the question mark permits this value to be null
    val nullableMessage: String? = null
    // the compiler ca inferr the null
    val inferredNull = null

    // if the value is not null, then run the length
    // if inteadm,we use a !!, it means stop complaining, i don't care about nullsPointersExceptions
    println(nullableMessage?.length)

}