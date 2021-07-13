package common

/**
 * Desafio
 * A corrida de tartarugas é um esporte que cresceu muito nos últimos anos, fazendo com que vários c
 * ompetidores se dediquem a capturar tartarugas rápidas, e treina-las para faturar milhões em
 * corridas pelo mundo. Porém a tarefa de capturar tartarugas não é uma tarefa muito fácil, pois
 * quase todos esses répteis são bem lentos. Cada tartaruga é classificada em um nível dependendo de sua velocidade:
 *
 * Nível 1: Se a velocidade é menor que 10 cm/h .
 * Nível 2: Se a velocidade é maior ou igual a 10 cm/h e menor que 20 cm/h .
 * Nível 3: Se a velocidade é maior ou igual a 20 cm/h .
 * Sua tarefa é identificar qual o nível de velocidade da tartaruga mais veloz de um grupo.
 *
 * Entrada
 * A entrada consiste de múltiplos casos de teste, e cada um consiste em duas linhas:
 * A primeira linha contém um inteiro L (1 ≤ L ≤ 500) representando o número de tartarugas do grupo
 * , e a segunda linha contém L inteiros Vi (1 ≤ Vi ≤ 50) representando as velocidades de cada tartaruga do grupo.
 *
 * Saída
 * Para cada caso de teste, imprima uma única linha indicando o nível de velocidade da tartaruga mais veloz do grupo.
 */
import java.io.EOFException
import java.lang.Exception
import java.lang.NullPointerException
import kotlin.math.absoluteValue

fun main(args: Array<String>) {

    while (true) {
        try {
//            val l = 10//readLine()!!.toInt()
//            val v = arrayListOf(10, 10, 10, 10, 15, 18, 20, 15)//readLine()!!.split(" ").run { { () } }
            val l = 10
//            val v = arrayListOf(1, 5, 2, 9, 5, 5, 8, 4, 4, 3)
            val v = arrayListOf(19, 9, 1, 4, 5, 8, 6, 11, 9, 7)
            v.sort()
            val last = v.last()

            when {
                last < 10 -> print(1)
                last in 10..19 -> print(2)
                else -> print(3)
            }
            return

        } catch (f: ClassNotFoundException) {
            break
        } catch (n: NullPointerException) {
            break
        } catch (e: Exception) {
            break
        }
    }
}