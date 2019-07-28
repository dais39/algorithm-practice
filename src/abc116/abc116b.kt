package abc116

fun main(args: Array<String>) {

    val s = readLine()!!.toInt()

    val list = mutableListOf(s)

    var n = list[0]

    var i = 1

    while (true) {
        i++

        val a = f(n)

        if (list.find { it == a } != null) {
            println(i)
            break
        }

        list.add(a)
        n = a
    }
}


fun f(n: Int): Int {
    return if (n % 2 == 0) {
        n / 2
    } else {
        3 * n + 1
    }
}
