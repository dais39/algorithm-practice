package atcoder.abc146

fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    val S = readLine()!!

    var ans = ""
    for(i in S.indices){
        ans += shift(S[i], N)
    }
    println(ans)
}

fun shift(char: Char, shift: Int): String{
    return ('A' + (char - 'A' + shift) % 26).toString()
}

