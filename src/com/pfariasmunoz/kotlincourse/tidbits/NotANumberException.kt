package com.pfariasmunoz.kotlincourse.tidbits

/**
 * Created by pablo on 18-07-17.
 */
class NotANumberException(message: String) : Throwable(message) {

}

fun checkIsNumber(obj: Any) {
    when(obj) {
        !is Float, Int, Double, Long -> throw NotANumberException("This is not a Number")
    }
}

fun main(args: Array<String>) {


    try {
        checkIsNumber("A")
        checkIsNumber(1)
    } catch (e: NotANumberException) {
        println("${e.message}")
    } catch (e: IllegalArgumentException) {
        println("Do nothing")
    }
}