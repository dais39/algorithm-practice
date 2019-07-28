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

    if (!steps[0] && !steps[1]) {
        println(0)
        return
    }

    stepAnswers[0] = if (!steps[0]) 0L else 1L
    stepAnswers[1] = if (!steps[1]) {
        0L
    } else if (!steps[0]) {
        1L
    } else {
        2L
    }

    for (i in 2 until n) {
        if (!steps[i - 1] && !steps[i - 2]) {
            println(0)
            return
        }
        if (!steps[i]) {
            stepAnswers[i] = 0
            continue
        }
        stepAnswers[i] = stepAnswers[i - 1] + stepAnswers[i - 2]
    }

    println(stepAnswers[n - 1] % 1000000007L)
}
