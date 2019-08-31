package atcoder.abc133

fun main(args: Array<String>) {

    val (l, r) = readLine()!!.split(" ").map { it.toLong() }

    var ans = 2019L
    for(i in l until r){
        for(j in i+1..r){
            ans = Math.min(ans, ((i % 2019) * (j % 2019)) % 2019)
            if(ans == 0L) {
                println(ans)
                return
            }
        }
    }
    println(ans)
}
