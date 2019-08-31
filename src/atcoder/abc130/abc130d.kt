package atcoder.abc130

fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map{it.toInt()}
    val a = readLine()!!.split(' ').map{it.toLong()}
    var right = 0
    var sum = 0L
    var ans = 0L
    for (left in 0 until n) {
        while(right < n && sum + a[right] < k) {
            sum += a[right]
            right++
        }
        ans += n - right
        sum -= a[left]
    }
    println(ans)
}
