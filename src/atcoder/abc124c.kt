fun main(args: Array<String>) {
    val tiles = readLine()!!
    val l = tiles.length

    // 正解の型を作成する O(n)
    var b = arrayOfNulls<Char>(l)
    var w = arrayOfNulls<Char>(l)
    for (i in 0 until l){
        if(i % 2 == 0){
            b[i] = '0'
            w[i] = '1'
        }else{
            b[i] = '1'
            w[i] = '0'
        }
    }

    // タイルの塗り替え回数を保持するカウンタ
    var bc = 0
    var wc = 0

    // 入力されたタイルの状態と、正解の状態を比較して、塗り替え回数を計算する O(n)
    tiles.forEachIndexed { index, c ->
        if(c != b[index]){
            bc++
        }
        if(c != w[index]){
            wc++
        }
    }

    println(Math.min(bc, wc))
}
