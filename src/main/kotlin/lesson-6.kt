package org.example

fun main() {
    //while, do while
    var counter = 5

    while (counter > 0){
        println("Счётчик: ${counter--}")
        Thread.sleep(500)
    }
    println()

    do{
        println("Счётчик: $counter")
        Thread.sleep(500)
        counter--
    } while(counter > 5)
}