package baekjoon_online.p_1110

import java.util.Scanner

fun main(args: Array<String>) {

    // First line
    val sc = Scanner(System.`in`)
    val givenNumber = sc.nextInt()

    var count = 0
    var generated = givenNumber
    while (true) {
        count++
        val firstNumber = generated / 10
        val secondNumber = generated % 10
        generated = (secondNumber * 10) + ((firstNumber + secondNumber) % 10)

        if (generated == givenNumber) {
            break;
        }
    }
    println(count)
}