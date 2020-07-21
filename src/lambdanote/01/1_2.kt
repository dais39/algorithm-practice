fun main() {

    val n = readLine()!!.toInt()

    val lines = (0 until n).map { readLine()!! }

    var left = 0
    var right = 50

    while (true) {

        if (lines.size < right) {
            (lines.size - 1 downTo left).forEach { println(lines[it]) }
            break
        }

        (right - 1 downTo left).forEach { println(lines[it]) }

        left += 50
        right += 50
    }
}