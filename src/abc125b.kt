fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    val vlist = readLine()!!.split(" ").map{it.toInt()}
    val clist = readLine()!!.split(" ").map{it.toInt()}

    var ans = 0

    for(i in 0 until n){
        if(vlist[i] - clist[i] > 0){
            ans += vlist[i] - clist[i]
        }
    }
    println(ans)
}
