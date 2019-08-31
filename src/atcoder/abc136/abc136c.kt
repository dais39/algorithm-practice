package atcoder.abc136

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val h = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    if (n == 1) {
        println("Yes")
        return
    }

    var c = 0

    for (i in n - 2 downTo 0) {

        if(h[i] <= h[i+1]) continue

        if (h[i] - h[i+1] == 1){
            h[i] -= 1
            continue
        }

        c++
        break
    }

    if (c == 1) println("No") else println("Yes")
}
