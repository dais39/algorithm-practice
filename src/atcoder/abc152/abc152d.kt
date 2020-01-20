package atcoder.abc152

fun main(args: Array<String>) {

    val N = readLine()!!.toInt()

    val array = Array(10) { Array(10) { 0 } }

    // 先頭の数字と末尾の数字の組み合わせごとの登場回数を数える
    for (i in 1..N) {
        val str = i.toString().toCharArray()
        array[str.first().toString().toInt()][str.last().toString().toInt()] += 1
    }

    // 1からNまでの各数字に対して、条件を満たす数の個数を数えて合計を計算する
    var ans = 0
    for (j in 1..N) {
        val str = j.toString().toCharArray()
        ans += array[str.last().toString().toInt()][str.first().toString().toInt()]
    }

    println(ans)
}
