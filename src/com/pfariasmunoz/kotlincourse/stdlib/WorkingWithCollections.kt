package com.pfariasmunoz.kotlincourse.stdlib

fun main(args: Array<String>) {

    val numbers = 1..100
    val cities = listOf("Madrid", "Santiago", "Melipilla", "Mongolia")
    val mutableCities = mutableListOf("Sangiago", "Cartagena")
    mutableCities.add("Changundo")

    val hashMap = hashMapOf(Pair("Madrid", "Spain"))

    val booleans = booleanArrayOf(true, false, true)
    val characters = charArrayOf('a', 'n')
}