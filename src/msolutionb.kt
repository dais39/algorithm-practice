fun main(args: Array<String>) {

    val r = readLine()!!.split("")

    val l = r.count { it == "x" }

    println(if(l <= 7) "YES" else "NO")
}
