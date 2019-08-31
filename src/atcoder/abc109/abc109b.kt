package atcoder.abc109

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val w = (1..n).map { readLine()!! }

    for(i in 1 until n){
        if(w[i].first() != w[i-1].last()){
            println("No")
            return
        }

        for(j in 0 until i){
            if(w[i] == w[j]){
                println("No")
                return
            }
        }
    }

    println("Yes")
}
