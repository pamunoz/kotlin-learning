package com.pfariasmunoz.kotlincourse.tidbits

/**
 * Created by pablo on 15-07-17.
 */
open class Person {

}

class Employee: Person() {
    fun vacationDays(days: Int) {
        if (days < 60) {
            println("You need more vacations")
        }
    }
}

class Constractor: Person() {

}

fun hasVacations(obj: Person) {
    if (obj is Employee) {
        obj.vacationDays(20)
    }
}

var input: Any = 10

fun main(args: Array<String>) {

    val str = input as? String

    println(str?.length)
}