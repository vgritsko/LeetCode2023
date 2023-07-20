package easy

import kotlin.math.max
//https://leetcode.com/problems/maximum-depth-of-binary-tree/
class MaximumDepthBinaryTree {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null)
            return 1

        val leftDepth = maxDepth(root.left)
        val rightDepth = maxDepth(root.right)
        return 1+ max(leftDepth,rightDepth)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}

//
// * Example:
// * var ti = TreeNode(5)
// * var v = ti.`val`
// * Definition for a binary tree node.

