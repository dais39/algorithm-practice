fun main(args: Array<String>) {
    val (a, b, t) = readLine()!!.split(" ").map { it.toInt() }

    var sum = 0
    var c = 1
    var ans = 0

    while(true){
        sum += a*c
        if(t+0.5 <= sum) break
        ans += b
    }

    println(ans)
}
