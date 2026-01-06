package org.example

fun main() {
    val firstChislo = 46
    val secondChislo: Int

    secondChislo = readLine().toString().toInt()

    val summa = firstChislo + secondChislo

    val textItog = "Итог:"

    println("$textItog $summa")
}