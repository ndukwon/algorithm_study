package baekjoon_online.p_1003

import java.util.Scanner

/*
INPUT
3
0
1
3

 */

fun main(args: Array<String>) {
    val MAX_FIBONACCI = 41
    val sc = Scanner(System.`in`)

    val fibonacci = Array(MAX_FIBONACCI, { 0 })
    fibonacci[0] = 0
    fibonacci[1] = 1
    for (i in 2..(MAX_FIBONACCI - 1)) {
//        println("i=$i")
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]
    }

    // First line
    val count = sc.nextInt()

    for (i in 1..count) {
        val index = sc.nextInt()
        val a: Int
        val b: Int
        if (index == 0) {
            a = 1
            b = 0
        } else {
            a = fibonacci[index - 1]
            b = fibonacci[index]
        }

        println("$a $b")
    }
}