package abc129

fun main(args: Array<String>) {

    val (n, m) = readLine()!!.split(" ").map { it.toInt() }

    val a = (1..m).map { readLine()!!.toInt() }.toTypedArray()

    val stepAnswers = Array(n) { 0L }
    val steps = Array(n) { true }

    // 壊れている段を記録
    for (i in 0 until m) {
        steps[a[i] - 1] = false
    }

    // 最上段が1の場合
    if(n == 1){
        println(1)
        return
    }

    // 最上段が2の場合
    if(n == 2){
        if(!steps[0]) println(1) else println(2)
        return
    }

    stepAnswers[0] = if (!steps[0]) 0L else 1L
    stepAnswers[1] = if (!steps[1]) 0L else 1L + stepAnswers[0]

    for (i in 2 until n) {
        if (!steps[i - 1] && !steps[i - 2]) {
            println(0)
            return
        }
        if (!steps[i]) {
            stepAnswers[i] = 0L
            continue
        }
        stepAnswers[i] = (stepAnswers[i - 1] + stepAnswers[i - 2]) % 1000000007L
    }

    println(stepAnswers[n - 1] % 1000000007L)
}
