package abc116

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val h = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    var c = 0

    // 全ての要素が条件を満たすまでループ
    while(true){
        if(h.max() == 0) break

        var i = 0
        while(i < n){

            // すでに条件を満たしている要素はスキップ
            if(h[i] == 0){
                i++
                continue
            }

            // 条件を満たしていない要素の場合は条件を満たしている要素が見つかるまで水をあげる
            c++
            while(i < n && h[i] > 0){
                h[i]--
                i++
            }
        }
    }

    println(c)
}
