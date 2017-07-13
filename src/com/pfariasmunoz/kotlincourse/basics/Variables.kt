package com.pfariasmunoz.kotlincourse.basics

/**
 * Created by pablo on 08-07-17.
 */
fun main(args: Array<String>) {
    var streetNumber = 10
    var streetName = "High Street"

    val zip = "E11 P1"

    val myLong = 10L
    val myFloat = 100F
    val myHex = 0x0F
    val myinary = 0xb01

    val myInt = 100
    val myLongAgain: Long = myInt.toLong()

    // String

    val myChar = 'A'
    val myString = "My String"

    val escapeCharacters = "A new linke \n"

    val rawString = "Hello" +
            "This is a second line" +
            "A third line"
    val multipleLines = """
    This is a string
    And has multiple
    lines
    """
    val years = 10
    val message = "A decade is $years years"

    val name = "Mary"
    val anotherMessage = "Lenght of name is ${name.length}"
}