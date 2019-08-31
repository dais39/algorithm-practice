package pattern.data_stracture

data class Node<K, V>(
    val key: K,
    val value: V,
    val left: Node<K, V>?,
    val right: Node<K, V>?
)

fun main() {

    /*
        1 -> 2
        1 -> 3
     */
    val child1 = Node(2,2, null, null)
    val child2 = Node(3,3, null, null)
    val root = Node(1, 1, child1, child2)

    println("preorder")
    preorder(root)

    println("inorder")
    inorder(root)

    println("postorder")
    postorder(root)

}

fun <K, V> preorder(node: Node<K, V>?) {
    if (node == null) return
    println(node.value)
    preorder(node.left)
    preorder(node.right)
}

fun <K, V> inorder(node: Node<K, V>?) {
    if (node == null) return
    inorder(node.left)
    println(node.value)
    inorder(node.right)
}

fun <K, V> postorder(node: Node<K, V>?) {
    if (node == null) return
    postorder(node.left)
    postorder(node.right)
    println(node.value)
}
