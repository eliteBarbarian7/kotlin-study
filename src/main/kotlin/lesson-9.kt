package org.example

fun main () {
    // List - список, обращаемся по индексам, могут повторяться элементы
    // Array - массив, фиксированный размер
    // Set - множество, список уникальных элементов
    // Map - словарь, доступ к данным по ключу


    val neIzmenSpisok: List<Int> = listOf(5,2,4) //Не изменяемый список
    val izmenSpisok: MutableList<Int> = mutableListOf(1, 4, 33, 2, 4, 100) //Изменяемый список
    println(izmenSpisok)

    izmenSpisok.add(0,100) // добавление элемента в список(без указания индекса элемент добавляется в конец)
    println(izmenSpisok)

    println(izmenSpisok.contains(100)) // возвращает значение true если в списке есть указанный элемент


    println(izmenSpisok.isEmpty()) // true если список пустой
    println(izmenSpisok.isNotEmpty()) // true если список не пустой

    //возвращает индекс элемента который мы указываем(если элементов таких несколько в списке то выводит индекс первого который встретит)
    println(izmenSpisok.indexOf(100)) // перебор с начала списка
    println(izmenSpisok.lastIndexOf(100)) // перебор с конца списка


    // сортировка списка
    izmenSpisok.sort() //по возрастанию
    println(izmenSpisok)
    izmenSpisok.sortDescending() //по убыванию
    println(izmenSpisok)
    izmenSpisok.reverse() //в обратном порядке
    println(izmenSpisok)


    izmenSpisok.forEach {
        println(it)
    }

    // интервал - for
    // коллекция - forEach
    // break, continue - for

    println()


    // фильтрация коллекций
    val izmenSpisok2 = izmenSpisok.filter {
        it == 100
    }

    izmenSpisok2.forEach {
        println(it)
    }


    // map используется если нужно повзаимодействвовать со всемы элементами
    val izmenSpisok3 = izmenSpisok2.map { it * 2 }

    izmenSpisok3.forEach{ println(it)}





}