package baekjoon_online.p_1149

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

/*
3
26 40 83
49 60 57
13 89 99

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
    var bestPathForR = 0
    var bestPathForG = 0
    var bestPathForB = 0
    while (count > 0) {
        try {
            line = inputReader.readLine()
        } catch (e: IOException) {
            e.printStackTrace()
        }

        val rgbStrings = line!!.trim().split(" ")
        val nextR = Integer.parseInt(rgbStrings[0])
        val nextG = Integer.parseInt(rgbStrings[1])
        val nextB = Integer.parseInt(rgbStrings[2])

        val currentBestR = Math.min(bestPathForG, bestPathForB) + nextR
        val currentBestG = Math.min(bestPathForR, bestPathForB) + nextG
        val currentBestB = Math.min(bestPathForR, bestPathForG) + nextB
        bestPathForR = currentBestR
        bestPathForG = currentBestG
        bestPathForB = currentBestB
        count--
    }

    val bestPathResult = Math.min(bestPathForR, Math.min(bestPathForG, bestPathForB))
    println(bestPathResult)
}