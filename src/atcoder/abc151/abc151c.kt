package atcoder.abc151

fun main(args: Array<String>) {

    val (N, M) = readLine()!!.split(" ").map { it.toInt() }

    // 問題番号と結果のPairを持つリスト
    val results = (1..M).map {
        val (p, s) = readLine()!!.split(" ")
        Pair(p, s)
    }

    var ac = 0
    var penalty = 0

    // Key: 問題番号, Value: ACとWAそれぞれの回数を持つPair
    val scores = mutableMapOf<String, Pair<Int, Int>>()
    results.forEach { result ->
        // 過去に同じ問題を解いた結果を取得
        val score = scores[result.first]

        // 初めての問題に対する結果であれば、結果をscoresに登録
        if (score == null) {
            scores[result.first] = if (result.second == "WA") Pair(0, 1) else{
                ac++
                Pair(1, 0)
            }
            return@forEach
        }

        // 過去に同じ問題を解いている場合、"AC"済かどうかをチェック
        // AC済の場合continue
        if(score.first != 0) return@forEach

        // AC済ではない場合は、今回の結果がACかどうかチェック
        // ACの場合以前解いた結果のWAの回数をpenaltyに追加して、acを++して、scoresを更新する
        if(result.second == "AC"){
            penalty += score.second
            ac++
            scores[result.first] = score.copy(first = score.first + 1)
            return@forEach
        }

        // 今回の結果がWAの場合scoresのWAの回数++
        scores[result.first] = score.copy(second = score.second + 1)
    }

    println("$ac $penalty")
}
