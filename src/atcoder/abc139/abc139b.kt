package atcoder.abc139

fun main(args: Array<String>) {

    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    // 差込口の数
    var plugs = 1

    // 電源タップの個数
    var taps = 0

    // 差込口がb個以上になるまで電源タップを増やす
    while(plugs < b){
        taps++
        plugs = plugs - 1 + a
    }

    println(taps)
}
