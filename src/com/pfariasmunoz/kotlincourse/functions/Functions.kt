package com.pfariasmunoz.kotlincourse.functions

/**
 * Created by pablo on 14-07-17.
 */
fun hello() {
    println("Hello")
}
// Example of Nothing return type
fun throwingExceptions(): Nothing {
    throw Exception("this function throw an exception")
}

// Return a value
fun returnAFour(): Int {
    return 4
}

fun takingString(name: String) {
    println(name)
}

// The return type is inferred
fun sum(x : Int, y : Int = 0) = x + y

fun printDetails(name: String, email: String = "no-email", phone: String) {
    println("name: $name - email: $email - phone: $phone")
}

// A function with an undefined number of parameters
fun printStrings(vararg strings: String) {
    // the * is use to pass the vararg as an argument
    reallyPrintStrings(*strings)
}

private fun reallyPrintStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

// Example of Unit return type
fun main(args: Array<String>) {
    hello()

    val value = returnAFour()

    takingString("Print some value")

    // This functions has a default second parameter
    sum(5, 7)
    sum(6)
    // kotlin allow us to call functions with named parameters
    printDetails("Pablo", phone = "555-7788")

    printStrings("1")
    printStrings("1", "2")
    printStrings("1", "2", "3")
    printStrings("1", "2", "3", "4")
}