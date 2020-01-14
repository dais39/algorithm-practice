package atcoder.abc150

fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    val S = readLine()!!

    var ans = 0
    for(i in 0 until N - 2){
        if(S[i] == 'A' && S[i+1] == 'B' && S[i+2] == 'C') ans++
    }

    println(ans)
}
