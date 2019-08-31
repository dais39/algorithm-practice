package atcoder.abc126

fun main(args: Array<String>) {

    val (n, k) = readLine()!!.split(" ").map { it.toInt() }

    var ans = 0.0

    for(i in 1 .. n){
        var t = i
        var c = 0
        while (t < k){
            t *= 2
            c++
        }

        ans += (1.0/n) * Math.pow(0.5, c.toDouble())
    }

    println(ans)
}
