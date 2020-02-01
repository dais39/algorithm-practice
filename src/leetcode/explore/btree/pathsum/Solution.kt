package leetcode.explore.btree.pathsum

class Solution {
    fun hasPathSum(root: TreeNode?, sum: Int): Boolean {
        if(root == null) return false
        return _hasPathSum(root, sum)
    }

    private fun _hasPathSum(node: TreeNode, sum: Int): Boolean{
        if(node.right == null && node.left == null){
            return sum == node.`val`
        }
        if(node.left == null) return _hasPathSum(node.right!!, sum - node.`val`)
        if(node.right == null) return _hasPathSum(node.left!!, sum - node.`val`)
        return _hasPathSum(node.left!!, sum - node.`val`) || _hasPathSum(node.right!!, sum - node.`val`)
    }
}

class TreeNode(val `val`: Int){

    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun main() {

    val tree = TreeNode(5).apply {
        left = TreeNode(4).apply {
            left = TreeNode(11).apply {
                left = TreeNode(7)
                right = TreeNode(2)
            }
        }
        right = TreeNode(8).apply {
            left = TreeNode(13)
            right = TreeNode(4).apply {
                right = TreeNode(1)
            }
        }
    }

    println(Solution().hasPathSum(tree, 22))
}
