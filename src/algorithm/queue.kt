package algorithm

fun main(args: Array<String>) {

    val s = Queue()

    s.enQueue(1)
    s.enQueue(2)
    s.enQueue(3)

    println(s.deQueue())
    println(s.deQueue())
}

class Queue {

    var count = 0
    private val data = Array(5) { -1 }
    var top = 0

    fun enQueue(n: Int): Boolean {
        if (count >= data.size) false
        data[(top + count) % data.size] = n
        count++
        return true
    }

    fun deQueue(): Int{
        if (count == 0) throw RuntimeException()
        val x = data[top++]
        count--
        if(top == data.size) top = 0
        return x
    }
}
