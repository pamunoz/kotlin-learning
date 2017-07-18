package com.pfariasmunoz.kotlincourse.tidbits

import com.pfariasmunoz.kotlincourse.classes.CustomerKotlin

/**
 * Created by pablo on 18-07-17.
 */
fun capitalAndPopulation(counry: String): Pair<String, Long> {
    return Pair("Madrid", 2300000)
}

fun countryInfo(country: String): Triple<String, String, Long> {
    return Triple("Madrid", "Europe", 2300000)
}

fun main(args: Array<String>) {


    val (capital, population) = capitalAndPopulation("Spain")
    // Kotlin offer the ability to deconstruct values
    // This provides semantics that Pairs and Triples are taking away.
    println(capital)
    println(population)

    // we can to it with classes too
    val (id, name, email) = CustomerKotlin(3, "Pablo", "pfariasmunoz@gmail.com")
    println("id: $id, name: $name and email: $email ")
}