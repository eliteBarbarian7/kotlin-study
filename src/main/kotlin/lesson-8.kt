package org.example

fun main() {
    val ingredients: Array<String> = arrayOf("яйцо","огурец","помидор","чеснок","лук")

    //Явное проставление типов мы используем для наглядности и ещё эти массивы можно проинициализировать пустыми
    val chisla = intArrayOf(5,33,2)
    val simvoli = charArrayOf('a', 'b', 'n')
    val chisla1 = intArrayOf()
    val simvoli1 = intArrayOf()

    //Такой массив тоже можно проинициализировать пустым
    var pustoySpisok:Array<String> = arrayOf()



    println("Размер массива ингридеентов: ${ingredients.size}") // нахождение размера массива

    println("id: ${ingredients.indexOf("лук")}") // нахождение индекса элемента

    // изменение элемента массива по его индексу
    ingredients[4] = "Свекла"
    ingredients.set(1,"хлеб")

    // получение элемента массива по его id
    println(ingredients[4])
    println(ingredients.get(0))

    println()

    println("Список все ингредиентов: ")
    for (i in ingredients) {
        println("${ingredients.indexOf(i) + 1}) $i")

    }
}