package com.pfariasmunoz.kotlincourse.functional

/**
 * Created by pablo on 18-07-17.
 */
fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun operation(x: Int, op: (Int) -> Unit) {

}

fun route(path: String, vararg actions: (String, String) -> String) {

}

fun unaryOperation(x: Int, op: (Int) -> Int) {}
fun unaryOperation2(op: (Int) -> Int){}

fun transaction(db: Database, code: () -> Unit) {
    try {
        code()
    } finally {
        db.commit()
    }
}

class Database {
    fun commit(){}
}

fun sum(x: Int, y: Int) = x + y

fun main(args: Array<String>) {

    println(operation(3, 4, ::sum))

    // intead of the function, we added a lambda expression
    operation(4, 5, {x, y -> x +  y})

    unaryOperation(2, {x -> x * x})

    // In Kotlin we don't need to be explicit
    unaryOperation(3, { it * it})

    // It is the same as above
    unaryOperation(3) {it * it}
    // if the only parameter is another function, it does'nt need brackets
    // AND it can have multiple lines
    unaryOperation2 {
        it * it
    }

    val db = Database()

    transaction(db) {
        // Interact with the database
        // it will do the "code" in the try, and then in the finally will do a commit to the db
    }

    // An anonymous function
    unaryOperation(3, fun(x: Int): Int {return x * x} )
}