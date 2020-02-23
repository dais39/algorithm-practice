package atcoder.abc156

fun main(args: Array<String>) {

    val (N, K) = readLine()!!.split(" ").map { it.toInt() }

    var ans = 0
    var i = N
    while(i >= K){
        i /= K
        ans++
    }
    println(ans+1)
}
