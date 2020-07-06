package atcoder.abc173

import kotlin.math.pow

fun main(args: Array<String>) {

    val (h, w, k) = readLine()!!.split(" ").map { it.toInt() }

    val hw = (1..h).map { readLine()!!.split("").filter { it.isNotBlank() }.toTypedArray() }.toTypedArray()

    var ans = 0

    // 0桁からh桁までの2進数のループ
    for (i in 0 until 2.0.pow(h).toInt()) {
        // 0桁からw桁までの2進数のループ
        for (j in 0 until 2.0.pow(w).toInt()) {
            val hb = ("%${h}s").format(Integer.toBinaryString(i)).replace(' ', '0')
            val wb = ("%${w}s").format(Integer.toBinaryString(j)).replace(' ', '0')

            var count = 0

            // 黒の個数を数える
            for (i in 0 until h) {
                for (j in 0 until w) {
                    if (hb[h - 1 - i] == '1') continue
                    if (wb[w - 1 - j] == '1') continue
                    if (hw[i][j] == "#") count++
                }
            }
            if (count == k) ans++
        }
    }

    println(ans)
}
