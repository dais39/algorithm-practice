package leetcode.explore.btree.symmetric

import com.sun.source.tree.Tree

class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        return isMirror(root, root)
    }
}

fun isMirror(t1: TreeNode?, t2: TreeNode?): Boolean{
    if(t1 == null && t2 == null) return true
    if(t1 == null || t2 == null) return false
    return (t1.`val` == t2.`val`) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left)
}

class TreeNode(val `val`: Int){

    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun main(){

    val tree = TreeNode(1).apply {
        left = TreeNode(2).apply {
            left = TreeNode(3)
            right = TreeNode(4)
        }
        right = TreeNode(2).apply {
            left = TreeNode(4)
            right = TreeNode(3)
        }
    }

    println(Solution().isSymmetric(tree))
}
