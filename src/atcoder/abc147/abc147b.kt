package atcoder.abc147

fun main(args: Array<String>) {

    val s = readLine()!!
    val c = (s.length) / 2

    var ans = 0
    for (i in 0 until c) {
        if (s[i] != s[s.length - 1 - i]) {
            ans++
        }
    }
    println(ans)
}
