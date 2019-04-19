package algorithm

fun main(args: Array<String>) {

    val s = Stack()
    s.push(1)
    s.push(2)
    s.push(3)
    s.push(2)
    s.push(1)

    s.pop()

    s.print()
}

class Stack {

    private val max = 5
    private val data = Array(max) { -1 }
    var top = 0

    fun push(n: Int) {
        if (top >= max) throw RuntimeException()
        data[top] = n
        top++
    }

    fun pop() {
        if (top == 0) throw RuntimeException()
        data[top-1] = -1
        top--
    }

    fun print(){
        for(i in data){
            if(i == -1) break
            println(i)
        }
    }
}
