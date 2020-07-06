package atcoder.abc173

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val ans = if(n % 1000 == 0){
        0
    }else{
        ((n/1000) + 1)*1000 - n
    }

    println(ans)
}