package atcoder.abc131

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val tasks = (1..n).map { readLine()!!.split(" ").map { it.toInt() } }

    val sortedTasks = tasks.sortedBy { it.last() }.toTypedArray()

    // タスクが1つの場合
    if(sortedTasks.size == 1){
        println(if(sortedTasks.first().first() <= sortedTasks.first().last()) "Yes" else "No")
        return
    }

    // タスクが複数ある場合
    var count = 0
    var sum = sortedTasks.first().first()
    for (i in 0 until sortedTasks.size - 1) {
        sum += sortedTasks[i + 1].first()
        if (sum > sortedTasks[i + 1].last()) break
        count++
    }

    if (count == sortedTasks.size - 1) println("Yes") else println("No")
}
