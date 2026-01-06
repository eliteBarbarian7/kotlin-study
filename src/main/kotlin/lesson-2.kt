package org.example

fun main() {
    var a1:Double = 7.00
    a1 = 3.00

    var b1 = 5.00


    println(a1 / b1)

    for (i in 1..10){

        var summa = b1 + i
        println(summa)

        if (summa == 13.00){
            break
        }
    }


}