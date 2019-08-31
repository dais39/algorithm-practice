package atcoder.abc136

fun main(args: Array<String>) {

    val s = readLine()!!

    // 連続したRのカウンタ
    var rCount = 0

    // 連続したLのカウンタ
    var lCount = 0

    // 連続したLの中で先頭のLのインデックス
    var rEnd = 0

    val answer = Array(s.length) { 0 }

    for (i in 0 until s.length) {

        if (s[i] == 'R') rCount++

        if (s[i] == 'L') lCount++

        if (i == s.length - 1) {
            answer[rEnd] += lCount / 2
            answer[rEnd + 1] += lCount / 2 + lCount % 2
            break
        }

        if (s[i] == 'R' && s[i + 1] == 'L') {

            // R
            answer[i] += rCount / 2 + rCount % 2

            // L
            answer[i + 1] += rCount / 2

            rCount = 0

            rEnd = i
        }

        if (s[i] == 'L' && s[i + 1] == 'R') {

            // L
            answer[rEnd + 1] += lCount / 2 + lCount % 2

            // R
            answer[rEnd] += lCount / 2

            lCount = 0
        }
    }

    println(answer.joinToString(" "))
}
