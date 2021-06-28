package one.digitalInnovation.collection

fun main() {
    val nomes = Array(3) { "" }
    nomes[0] = "Dijon"
    nomes[1] = "Cavalcante"
    nomes[2] = "Braga"

    for (nome in nomes)
        println(nome)
    println("============================")
    nomes.sort()
    nomes.forEach { println(it) }
    println("============================")
    val nomes2 = arrayOf("Dijon", "Cavalcante", "Braga")
    nomes2.sort()
    nomes2.forEach { println(it) }
}