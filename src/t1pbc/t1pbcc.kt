package t1pbc

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    // 境界より右にある.の数を求める
    val s = readLine()!!
    var w = s.filter { it == '.' }.count()
    var b = 0
    var ans = w

    // 境界を左端からずらしていき、境界の左にある#の数と右にある.の数の和を計算する
    // 最小ならば値を更新する
    for(i in (0 until n)){
        if(s[i] == '#'){
            b++
        }else{
            w--
        }
        ans = Math.min(ans, b + w)
    }

    println(ans)
}
