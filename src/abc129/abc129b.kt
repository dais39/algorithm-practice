package abc129

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val w = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    var min = Int.MAX_VALUE

    for(i in 0 until n){
        var s1 = 0
        var s2 = 0
        for(j in 0 .. i){
            s1 += w[j]
        }
        for(k in i+1 until n){
            s2 += w[k]
        }

        val diff = if(s1 > s2){
            s1-s2
        }else{
            s2-s1
        }

        if(min > diff){
            min = diff
        }
    }

    println(min)
}
