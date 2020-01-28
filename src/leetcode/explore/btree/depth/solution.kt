package leetcode.explore.btree.depth

import kotlin.math.max

class Solution {

    var ans = 0

    fun maximumDepth(root: TreeNode?, depth: Int) {
        if (root == null) return
        if (root.left == null && root.right == null) {
            ans = max(ans, depth)
        }
        maximumDepth(root.left, depth + 1)
        maximumDepth(root.right, depth + 1)
    }
}

class TreeNode(val `val`: Int) {

    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun main(){

    val input = TreeNode(1).apply {
        left = TreeNode(2).apply {
            left = TreeNode(3)
            right = TreeNode(4)
        }
        right = TreeNode(5)
    }

    val solution = Solution()
    solution.maximumDepth(input, 0)

    println(solution.ans)
}
