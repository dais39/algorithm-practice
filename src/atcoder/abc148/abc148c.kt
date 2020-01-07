package atcoder.abc148

fun main(args: Array<String>) {

    val (A, B) = readLine()!!.split(" ").map { it.toLong() }

    var ans = 0L
    ans = if(A > B){
        calc(A, B)
    }else{
        calc(B, A)
    }

    println(ans)
}

fun calc(large:Long, small:Long): Long{
    var ans = 0L
    for(i in large .. Long.MAX_VALUE step large){
        if(i % small == 0L){
            ans = i
            break
        }
    }

    return ans
}
