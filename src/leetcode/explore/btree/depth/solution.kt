package leetcode.explore.btree.depth

import leetcode.explore.btree.TreeNode
import kotlin.math.max

class Solution {

    var ans = 0

    fun maximumDepthTop(root: TreeNode?, depth: Int) {
        if (root == null) return
        if (root.left == null && root.right == null) {
            ans = max(ans, depth)
        }
        maximumDepthTop(root.left, depth + 1)
        maximumDepthTop(root.right, depth + 1)
    }

    fun maximumDepthBottom(root: TreeNode?, depth: Int): Int {
        if(root == null) return 0
        if (root.left == null && root.right == null) {
            return depth
        }

        val leftDepth = maximumDepthBottom(root.left, depth + 1)
        val rightDepth = maximumDepthBottom(root.right, depth + 1)

        return Math.max(leftDepth, rightDepth)
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

    val topSolution = Solution()
    topSolution.maximumDepthTop(input, 1)

    println(topSolution.ans)

    val bottomSolution = Solution()
    val ans = bottomSolution.maximumDepthBottom(input, 1)

    println(ans)
}
