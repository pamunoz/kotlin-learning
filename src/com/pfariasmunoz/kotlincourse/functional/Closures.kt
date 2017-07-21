package com.pfariasmunoz.kotlincourse.functional


fun outsideFunction() {
    for (number in 1..30) {


        // This is a clousure 'cause it is able to access the variable outside: number
        unaryOperation(20, { x ->
            println("The number is: $number")
            x * number

        })

    }
}

fun main(args: Array<String>) {
    outsideFunction()
}