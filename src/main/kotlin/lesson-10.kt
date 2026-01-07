package org.example

fun main() {
    informationAboutUser(name = userName(), age = userAge())
}


fun userName(): String? {
    print("Введите своё имя: ")
    return readLine().toString()
}

fun userAge(): Int? {
    print("Введите свой возраст: ")
    return readLine().toString().toInt()
}

fun informationAboutUser(name: String?, age: Int?){
    println("Вас зовут $name.\nВам $age лет.")
}