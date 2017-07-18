package com.pfariasmunoz.kotlincourse.classes

/**
 * Created by pablo on 15-07-17.
 */
// we can create objects, that are basically a singleton
object Global {
    val PI = 3.14
}

fun main(args: Array<String>) {
    // a local object created by an expression
    val localObject = object {
        val PI = 3.13159
    }

    println(Global.PI)
    println(localObject.PI)
}