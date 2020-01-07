package atcoder.abc148

fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    val (S, T) = readLine()!!.split(" ")

    var ans = ""

    (0 until N).forEach{
        ans += S[it]
        ans += T[it]
    }

    println(ans)
}
