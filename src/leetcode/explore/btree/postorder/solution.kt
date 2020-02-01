package leetcode.explore.btree.postorder

import leetcode.explore.btree.TreeNode

class Solution {

    fun postorderTraversal(root: TreeNode?): List<Int> {

        return recursive(root)
    }

    private fun recursive(root: TreeNode?): List<Int> {
        val post = mutableListOf<Int>()
        if (root == null) return post

        post.add(root.`val`)

        val lefts = postorderTraversal(root.left)

        val rights = postorderTraversal(root.right)

        return lefts + rights + post
    }
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
