package atcoder.abc157

fun main(args: Array<String>) {

    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
    val scPairs = (1..M).map {
        readLine()!!.split(" ").map { it.toInt() }
    }

    val number = Array(N) { -1 }

    for (pair in scPairs) {
        if (number[pair[0] - 1] != -1 && number[pair[0] - 1] != pair[1]) {
            println(-1)
            return
        }
        if (number[pair[0] - 1] == -1) {
            number[pair[0] - 1] = pair[1]
        }
    }

    if (N == 1 && number[0] == -1) {
        number[0] = 0
    }

    if (N != 1 && number[0] == 0) {
        println(-1)
        return
    }

    for (i in number.indices) {
        if (number[i] == -1) {
            if (i == 0) number[i] = 1 else number[i] = 0
        }
    }

    println(number.joinToString(""))
}
