package abc114

fun main(args: Array<String>) {

    val n = readLine()!!.toLong()

    var ans = 0L

    fun dfs(s: String) {

        if (s.isNotEmpty() && s.toLong() > n) return

        if (s.contains("3") && s.contains("5") && s.contains("7")) ans++

        dfs(s + "3")
        dfs(s + "5")
        dfs(s + "7")

    }

    dfs("0")
    println(ans)
}
