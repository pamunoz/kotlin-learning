package com.pfariasmunoz.kotlincourse.interop

import com.pfariasmunoz.kotlincourse.classes.CustomerJava

fun main(args: Array<String>) {

    // creating an object form a java class
    val customer = CustomerJava()

    // No problem colling a setter methor as a member variable
    customer.email = "pfariasmunoz@gmail.com"
    // no problem calling a java class method
    customer.prettyPrint()
}

// No problem inheriting from a java class
class PersonKotlin: PersonJava()

// No problem implementing a java interface
class KotlinCustomerRepo: CustomerJavaRepository {

    override fun gerById(id: Int): CustomerJava {
        return CustomerJava()
    }

    override fun getAll(): List<CustomerJava> {
        return listOf(CustomerJava())
    }

}