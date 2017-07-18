package com.pfariasmunoz.kotlincourse.classes

/**
 * Created by pablo on 15-07-17.
 */
enum class Priority(val value: Int) {
    MINOR(-1) {
        override fun toString(): String {
            return "Minor priority"
        }
    },
    NORMAL(0),
    MAJOR(1),
    CRITICAL(10)
}

fun main(args: Array<String>) {
    val priority = Priority.NORMAL
    println(priority)
    println(priority.value)
    println(Priority.MAJOR.ordinal)
    println(Priority.MAJOR.name)

    for (value in Priority.values()) {
        println(value)
    }

    val p = Priority.valueOf("MAJOR")
    println(p.ordinal)
    println(Priority.MINOR)
}