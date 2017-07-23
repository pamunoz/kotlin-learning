package com.pfariasmunoz.kotlincourse.functional

import com.pfariasmunoz.kotlincourse.interop.PersonJava

fun String.hello() {
    println("Its me!!")
}

fun String.toTitleCase(): String {
    return this.split(" ").joinToString("*") {it.capitalize()}
}

fun main(args: Array<String>) {
    "Hello ".hello()
    println("This is a sample string to Title Case it".toTitleCase())
}

class Customer {
    fun makePreferred() {
        println("Customer Version")
    }
}

fun Customer.makePreferred(message: String) {
    println(message)
}

open class BaseClass
class InheritedClass: BaseClass()

fun BaseClass.extension() {
    println("base extension")
}

fun InheritedClass.extension() {
    println("Inherited extension")
}

