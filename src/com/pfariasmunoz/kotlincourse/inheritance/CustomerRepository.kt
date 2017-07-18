package com.pfariasmunoz.kotlincourse.inheritance

/**
 * Created by pablo on 18-07-17.
 */
interface CustomerRepository {
    // you cannot give value to a property of an interface

    val isEmpty: Boolean
        // but you can implement getters and setters
        get() = true

    fun store(obj: Customer) {
        // implement
    }
    fun getById(id: Int): Customer
}
class SQLCustomerRepository: CustomerRepository {
    override val isEmpty: Boolean
        get() = false

    override fun getById(id: Int): Customer {
        return Customer()
    }

    override fun store(obj: Customer) {
        super.store(obj)
    }
}

interface ExampleInterface1 {
    fun funA() {
        println("Fun A from interface 1")
    }
}

interface ExampleInterface2 {
    fun funA() {
        println("Fun A from interface 2")
    }
}

class Class1And2: ExampleInterface1, ExampleInterface2 {
    override fun funA() {
        // we need to identify which interface we want to implement, so we use <>
        super<ExampleInterface1>.funA()
    }

}

fun main(args: Array<String>) {
    val c = Class1And2()
    c.funA()
}
