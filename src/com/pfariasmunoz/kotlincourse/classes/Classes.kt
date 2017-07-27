package com.pfariasmunoz.kotlincourse.classes

import java.io.IOException
import java.util.*

// the open a closing braces are only needed if the class has properties
class BasicClass
// A class with parameters and a default value
class Customer(val id: Int, var name: String = "Wakaka") {
    init {
        // An initialization block
        name = name.toUpperCase()
    }

    // There can be secondary constructor along with the primary constructor
    constructor(email: String): this(0, "")

}

// A class with a custom getter: age, and a custom setter: socialSecurityNumber
class User(val id: Int, var name: String, val yearOfBirth: Int) {
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth
    var socialSecurityNumber: String = ""
        set(value) {
            if (!value.startsWith("SN")) {
                throw IllegalArgumentException("Social security should start with SN")
            }
            // {field} hold the value of the property, so we can set it
            field = value
        }
}
// a {data} class gives getters and setters along with to string, equals, and hash code
data class CustomerKotlin(var id: Int, var name: String, var email: String) {
    @JvmField val someProperty = "value"

    @JvmOverloads fun changeStatus(status: Status = Status.Current) {

    }

    @JvmName("preferencial") fun makePreferential() {

    }

    @Throws(IOException::class)fun loadStatistics(filename: String) {
        if (filename == "") {
            throw IOException("filename cannot blank")
        }
    }
}

fun CustomerKotlin.extension() {

}

enum class Status {
    Current,
    Past
}

data class SimpleUser(val name: String, val email: String) {



    override fun toString(): String {
        return "{\"name\":\"$name\",\"email\":\"$email\"}"
    }

}


fun main(args: Array<String>) {
    val customer = Customer(23, "Pablo")
    val customer2 = Customer(33)
    val user = User(4, "Judas", 1983)
    user.socialSecurityNumber = "SN345"
    val customerKotlin = CustomerKotlin(6, "Christopher", "pontyus@waka.com")
    val customerPablo = customerKotlin.copy(email = "pfariasmunoz@gmail.com")
    val simpleUser = SimpleUser("Pablo Farias", "pfariasmunoz@gmail.com")


    println("Name of the customer: ${customer.name} and the id: ${customer.id}")
    println("Name of the customer: ${customer2.name} and the id: ${customer2.id}")

    println("User name: ${user.name}, user age: ${user.age} and SSN: ${user.socialSecurityNumber}")

    // the {data#toString} methods comes with the data classes, and in this case is implicit
    println(customerKotlin)
    println(customerPablo)
    println(simpleUser)

}