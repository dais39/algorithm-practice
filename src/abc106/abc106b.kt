package abc106

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    var ans = 0

    for (i in 1..n step 2){
        var c = 0
        for(j in 1..i){
            if(i % j == 0) c++
        }
        if(c == 8) ans++
    }

    println(ans)
}
