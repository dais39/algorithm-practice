fun main(args: Array<String>) {
    val (n, qn) = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine()!!
    val qlist = (1..qn).map { readLine()!!.split(" ").map { it.toInt() } }

    // 入力された文字列の左端からi番目までの文字列の中で右隣にCがあるAの個数を計算し、配列に格納しておく O(n)
    val tArray = Array(n) { 0 }
    for (i in 0 until n - 1) {
        tArray[i + 1] = tArray[i] + if (s.substring(i, i + 2) == "AC") 1 else 0
    }

    // t[r]とt[l]の差分が計算結果となる
    for (q in qlist) {
        val (l, r) = q
        val ans = tArray[r - 1] - tArray[l - 1]
        println(ans)
    }
}
