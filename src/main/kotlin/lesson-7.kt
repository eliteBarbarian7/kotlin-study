package org.example

fun main() {
    // диапазоны (интервалы)
    // диапазоны могут быть разных типов

    val range1: IntRange = 1..15
    val range2: IntRange = 40 until 400 //при использовании until в диапазон не включается последнее значение
    val range3: LongRange = 40L..400L
    val range4: CharRange = 'a'..'z'

    // диапазоны с типом closedRange тоесть типы double и float нельзя использовать в итерациях по их значениям
    val range5: ClosedRange<Double> = 40.1..400.1
    val range6: ClosedRange<Float> = 40.1f..400.1f

    val range7: IntProgression = 40..400 step 2 // диапазону можну указать шаг(тип меняется)
    val range8: IntProgression = 15 downTo 1// диапазон можно задать в обратную сторону(тип меняется)

    // in, !in
    val a = 50 in range1
    val b = 50 !in range1

    println("Итог_1: $a")
    println("Итог_2: $b")


    //цикл for
    //break, continue, return
    for (i in range1 step 3){
        println(i)
    }

    println()

    for (i in 5 downTo 1){
        if (i == 2){
            println("Пользователь нажал на кнопку \'Пропустить\'")
            break // этот оператор заканчивает цикл
//            return // этот оператор заканчивает работу программы
        }
        println("Реклама закончится через $i секунд")
        Thread.sleep(1000)
    }

    println()

    for (i in 1..15){
        if (i == 3){
            continue // этот оператор пропускает итерацию
        }
        println(i)
        Thread.sleep(300)
        if (i == 12){
            break
        }
    }

}