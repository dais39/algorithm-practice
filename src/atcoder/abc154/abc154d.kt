package atcoder.abc154

fun main(args: Array<String>) {

    val (N, K) = readLine()!!.split(" ").map { it.toInt() }

    val list = readLine()!!.split(" ").map { (it.toInt() + 1) / 2.0 }

    var sum = list.take(K).sum()
    var max = sum

    for (i in 0 until N - K) {
        sum += list[i + K] - list[i]
        if(sum > max){
            max = sum
        }
    }

    println(max)
}
