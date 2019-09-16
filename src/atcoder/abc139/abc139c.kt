package atcoder.abc139

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val hs = readLine()!!.split(" ").map { it.toInt() }

    var ans = 0

    var i = 0

    // 最後から2番目までループを回す
    while (i < n - 1) {

        var count = 0
        // 右隣が今いる高さより低い場合は移動する
        while (i < n - 1 && hs[i] >= hs[i + 1]) {
            i++
            count++
        }

        // 移動した回数が過去最多であれば更新
        ans = if (ans < count) count else ans

        // 次のマスに進む
        i++
    }

    println(ans)
}
