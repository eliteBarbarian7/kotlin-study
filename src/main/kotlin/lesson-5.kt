package org.example

fun main() {
    val userAge = readln().toInt()

    val resultProverki = if (userAge >= AGE_OF_MAJORITY_2){
        "Вы совершенолетний"
    }
    else if (userAge >= 16){
        "Вы почти совершенолетний"
    }
    else {
        "Вы несовершеннолетний"
    }

    println("Итог: $resultProverki")

    when(userAge){
        10 -> println("Вы ввели маленькое число")
        20 -> println("Вы ввели среднее число")
        30 -> println("Вы ввели большое число")
        else -> println("На ваше число нет проверки")
    }

}

const val AGE_OF_MAJORITY_2 = 18