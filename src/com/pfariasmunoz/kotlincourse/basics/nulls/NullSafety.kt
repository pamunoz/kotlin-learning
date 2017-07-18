package com.pfariasmunoz.kotlincourse.basics.nulls

/**
 * Created by pablo on 15-07-17.
 */
fun main(args: Array<String>) {

    val message: String = "Message"

    val nullMessage: String? = null

    val inferredNull = null

    println(nullMessage?.length)
}