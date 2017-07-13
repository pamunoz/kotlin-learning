package com.pfariasmunoz.kotlincourse.basics

/**
 * Created by pablo on 08-07-17.
 */
fun main(args: Array<String>) {
    for (a in 1..100) {
        print(a)
    }
    println("\n////////////")
    val numbers = 1..100

    for (a in numbers) {
        print(a)
    }

    println("\n////////////")


    // These are the same
    for (a in 100 downTo 1) {
        print(a)
    }
    println("\n////////////")

    for (a in 100..1) {
        print(a)
    }
    println("\n////////////")

    for (b in 100 downTo 1 step 5) {

    }

    val capitals = listOf("London", "Rome", "Madrid")
    for (capital in capitals) {
        println(capital)
    }

    var i = 100
    while (i > 0) {
        println("what")
        i--
    }

    do {
        var x = 10
        x--
    }while (x > 10)

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j % i == 0) {
                break@loop
            }
        }
    }



}