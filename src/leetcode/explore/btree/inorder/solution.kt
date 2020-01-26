package leetcode.explore.btree.inorder

class Solution {

    fun postorderTraversal(root: TreeNode?): List<Int> {

        return recursive(root)
    }

    private fun recursive(root: TreeNode?): List<Int> {
        val postOrders = mutableListOf<Int>()
        if (root == null) return postOrders

        postOrders.add(root.`val`)

        val lefts = postorderTraversal(root.left)

        val rights = postorderTraversal(root.right)

        return lefts + rights + postOrders
    }
}

class TreeNode(val `val`: Int) {

    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun main() {

    val input = TreeNode(1).apply {
        left = TreeNode(2).apply {
            left = TreeNode(3)
            right = TreeNode(4)
        }
        right = TreeNode(5)
    }

    val result = Solution().postorderTraversal(input)

    println(result)
}
