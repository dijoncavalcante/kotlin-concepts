package one.digitalInnovation.collection

fun main() {
    val values = intArrayOf(6, 3, 7, 2, 9, 5)

    for (valor in values) {
        println("Exemplo usando for - valor =  $valor")
    }

    println("========================")

    values.forEach {
        println("Exemplo usando forEach - valor =  $it")
    }

    println("========================")

    for (index in values.indices)
        println("Exemplo usando for to indices - valor =  " + values[index])

    println("========================")

    values.sort()

    for (valor in values) {
        println("Exemplo usando for - valor =  $valor")
    }
}