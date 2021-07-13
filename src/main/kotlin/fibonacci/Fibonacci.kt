package fibonacci

fun main(args: Array<String>) {
    val n = 46//entrada
    var a = 1
    var b = 1
    for (i in 0..(n-1)) {
        b = a - b
        a = a + b
        print("$b ")
    }
    println()
}