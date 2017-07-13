package com.pfariasmunoz.kotlincourse.basics

/**
 * Created by pablo on 08-07-17.
 */
fun main(args: Array<String>) {

    var myString = "Not empty"

    val result = if (myString != "") {
        "Not empty"
    } else {
        "Is Empty"
    }

    val whenValue = when (result) {
        "Value" -> {
            println("It's a value")
            println("Second statement")
            "Returning from first whan case"
        }
        is String -> {
            println("Excellent")
            "Remove that"
        }
        else -> {
            println("It came to this?")
            "third case "
        }
    }
    println(whenValue)
}
