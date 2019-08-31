package pattern

interface ImmutableStack<T> {

    fun push(element: T): ImmutableStack<T>

    fun pop(): ImmutableStack<T>

    fun getElements(): List<T>
}

class ImmutableStackImpl<T>(private val values: List<T> = emptyList()) : ImmutableStack<T> {

    override fun push(element: T): ImmutableStack<T> {
        return ImmutableStackImpl(this.values + element)
    }

    override fun pop(): ImmutableStack<T> {
        if (this.values.isEmpty()) throw UnsupportedOperationException("stack size is empty")
        return ImmutableStackImpl(this.values.drop(1))
    }

    override fun getElements(): List<T> {
        return this.values
    }
}

fun main() {

    val stack = ImmutableStackImpl<Int>()

    val stack1 = stack.push(1)
    val stack2 = stack1.push(2)
    val stack3 = stack2.push(3)

    val stack4 = stack3.pop()

    println(stack4.getElements())
}
