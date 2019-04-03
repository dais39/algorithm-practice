fun main() {

    val input = readLine()!!.split(" ").toMutableList()
    var perm = mutableListOf<String>()

    calc(input, perm)
}

fun calc(rest: MutableList<String>, perm: MutableList<String>) {
    if (rest.isEmpty()) {
        println(perm)
    } else {
        for (i in 0 until rest.size) {
            val p = ArrayList(perm)
            val r = ArrayList(rest)
            p.add(rest[i])
            r.removeAt(i)
            calc(r,p)
        }
    }
}
