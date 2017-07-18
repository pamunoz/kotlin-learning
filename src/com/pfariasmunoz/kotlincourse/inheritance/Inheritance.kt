package com.pfariasmunoz.kotlincourse.inheritance

/**
 * Created by pablo on 18-07-17.
 */
// You have to make the class open in order to make it inheritable
open class Person() {
    // much like the classes, we need to declare the members open to be able to override them
    open fun validate() {

    }
}
class Customer: Person {
    override fun validate() {
        super.validate()
    }

    constructor(): super() {

    }

}