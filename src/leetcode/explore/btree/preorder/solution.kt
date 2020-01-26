package leetcode.explore.btree.preorder

class Solution {

    fun preorderTraversal(root: TreeNode?): List<Int> {

        return recursive(root)
    }

    private fun recursive(root: TreeNode?): List<Int> {
        val pre = mutableListOf<Int>()
        if (root == null) return pre

        pre.add(root.`val`)

        val lefts = preorderTraversal(root.left)

        val rights = preorderTraversal(root.right)

        return pre + lefts + rights
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

    val result = Solution().preorderTraversal(input)

    println(result)
}
