package com.pfariasmunoz.kotlincourse.stdlib

fun main(args: Array<String>) {
    val elements = 1..100
    // the asSequence part convert the collection as a Lazy collection
    //
   /* val output = elements.asSequence().filter { it < 30 }.map { Pair("below 30", it) }

    output.forEach {
        println(it)
    }*/

    // lets help the compiler when to stop
    val output = elements.asSequence().take(30).sum()
    println(output)

    // As we can se, the code can be more complex
    val numbers = generateSequence(1) {
        x -> x + 10
    }

    println(numbers.take(30).sum())

    // We can get the values only when we need it
    // These values or value only is initialized when is called, no in the common top to bottom way
    val lazyInt: Int by lazy { 10 }
}