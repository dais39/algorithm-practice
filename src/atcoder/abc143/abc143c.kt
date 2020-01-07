package atcoder.abc143

fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    val S = readLine()!!

    var ans = 1
    for (i in 0 until N) {
        if (i == N - 1) break
        if (S[i] != S[i + 1]) ans++
    }

    println(ans)
}
