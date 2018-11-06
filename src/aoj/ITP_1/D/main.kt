package aoj.ITP_1.D

import java.util.*

fun main(args: Array<String>) {
    val num = Scanner(System.`in`).nextInt()

    val h = (num / 3600)
    val m = (num - (h * 3600)) / 60
    val s = (num - (h * 3600) - (m * 60))

    println("$h:$m:$s")
}