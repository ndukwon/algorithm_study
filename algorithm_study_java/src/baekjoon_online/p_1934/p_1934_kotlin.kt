package baekjoon_online.p_1934

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

/*
Input
3
1 45000
6 10
13 17

Output
45000
30
221
 */

fun main(args: Array<String>) {
    // First line
    val inputReader = BufferedReader(InputStreamReader(System.`in`))
    var line: String? = null
    try {
        line = inputReader.readLine()
    } catch (e: IOException) {
        e.printStackTrace()
    }

    var count = Integer.parseInt(line!!.trim())
    while (count-- > 0) {
        try {
            line = inputReader.readLine()
        } catch (e: IOException) {
            e.printStackTrace()
        }

        val abStrings = line!!.trim().split(" ")
        val a = Integer.parseInt(abStrings[0])
        val b = Integer.parseInt(abStrings[1])

        println(a * b / gcd(a, b))

    }
}

fun gcd(a: Int, b: Int): Int {
    var max = a
    var min = b
    do {
        val temp = max % min
        max = min
        min = temp
    } while (min != 0)

    return max
}
