package baekjoon_online.p_1929

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

fun main(args: Array<String>) {
    // First line
    val inputReader = BufferedReader(InputStreamReader(System.`in`))
    var line: String? = null
    try {
        line = inputReader.readLine()
    } catch (e: IOException) {
        e.printStackTrace()
    }
    val between = line!!.trim().split(" ")
    val a = Integer.parseInt(between[0])
    val b = Integer.parseInt(between[1])

    val checkPrimes = Array<Boolean>(b+1, {true});
    checkPrimes[0] = false
    checkPrimes[1] = false

    for (i in 2..b) {
        if (checkPrimes[i]) {
            for (j in (i+i)..b step i) {
                checkPrimes[j] = false
            }
        }
    }

    val sb = StringBuilder();
    for (i in a..b) {
        if (checkPrimes[i]) {
            sb.append(i).append("\n")
        }
    }
    print(sb.toString())
}