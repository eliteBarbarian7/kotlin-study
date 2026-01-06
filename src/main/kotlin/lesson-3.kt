package org.example

fun main() {
    var slovo1 = "Zdarova"
    var spase = " "
    var slovo2 = "sigmo"
    var predlojenie = slovo1 + spase + slovo2 // конкатенация строк


    println("$predlojenie.\n\"Мне: ${10+9} лет!\"") // интерполяция строк


    // Ровный отформатированный текст
    val multiString = """
            |dafdasf
         |sadfsda
                 |asfasgsfg
    """.trimMargin()
    println(multiString)



}