package com.pfariasmunoz.kotlincourse.inheritance

interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}

fun main(args: Array<String>) {
    val customerRepo = GenericRepository<Customer>()
    val customer = customerRepo.getById(5)
    val customers = customerRepo.getAll()

}