package one.digitalInnovation.collection

fun main() {
    val values = IntArray(5)
    values[0] = 7
    values[1] = 4
    values[2] = 2
    values[3] = 1
    values[4] = 9

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