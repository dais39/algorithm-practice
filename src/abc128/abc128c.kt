package abc128

fun main(args: Array<String>) {

    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val lights = (1..m).map { readLine()!!.split(" ").drop(1).map { it.toInt() }.toTypedArray() }.toTypedArray()
    val p = readLine()!!.split(" ").map { it.toInt() }

    val onoff = Array(n) { 0 }

    fun dfs(i: Int, onoff: Array<Int>): Int {

        if (i < 0) {
            var c = 0
            for (j in 0 until lights.size) if (lights[j].filter { onoff[it - 1] == 1 }.size % 2 == p[j]) c++
            return if (c == lights.size) 1 else 0
        }

        val on = onoff.copyOf()
        on[i] = 1
        return dfs(i - 1, onoff) + dfs(i - 1, on)
    }

    println(dfs(n - 1, onoff))
}
