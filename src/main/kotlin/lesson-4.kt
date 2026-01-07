package org.example

fun main() {
    // логические операторы
    // операторы сравнения

    // >, <, >=, <=, ==, !=
    // not() или !, or(||), and(&&)

    // операторы ссылочного сравнения: ===, !==

    print("Введите ваш возраст: ")
    val userAge = readLine().toString().toInt()
    val itog: Boolean = userAge >= AGE_OF_MAJORITY && userAge <= 35 || (userAge == 3).not()
    println("Итог_1: $itog")

    val itog2 = userAge in AGE_OF_MAJORITY..45
    println("Итог_2: $itog2")



}

const val AGE_OF_MAJORITY = 18