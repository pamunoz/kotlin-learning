@file:JvmName("KotlinFunctions")
package com.pfariasmunoz.kotlincourse.interop

const val copyrightYear = 2017

fun prefix(prefix: String, value: String): String {
    return "$prefix - $value"
}