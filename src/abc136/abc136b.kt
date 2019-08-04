package abc136

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    when {
        n < 10 -> println(n)
        n < 100 -> println(9)
        n < 1000 -> println(n - 90)
        n < 10000 -> println(909)
        n < 100000 -> println(n - 9090)
        else -> println(90909)
    }
}
