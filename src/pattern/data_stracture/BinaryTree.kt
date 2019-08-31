package pattern.data_stracture

data class Node<K, V>(
    val key: K,
    val value: V,
    val left: Node<K, V>?,
    val right: Node<K, V>?
) {

    companion object {

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

        fun <K : Comparable<K>, V> searchNode(key: K, root: Node<K, V>): Node<K, V>? {

            var p: Node<K, V>? = root
            while (p != null) {

                val cond = compareValues(key, p.key)
                if (cond == 0) return p
                p = if (cond < 0) p.left else p.right
            }

            return null
        }
    }
}

fun main() {

    /*
        1 -> 2
        1 -> 3
     */
    val left = Node(1, 1, null, null)
    val right = Node(3, 3, null, null)
    val root = Node(2, 2, left, right)

    println("preorder")
    Node.preorder(root)

    println("inorder")
    Node.inorder(root)

    println("postorder")
    Node.postorder(root)

    println("searchNode")
    println(Node.searchNode(1, root))
    println(Node.searchNode(2, root))
    println(Node.searchNode(3, root))
    println(Node.searchNode(4, root))
}
