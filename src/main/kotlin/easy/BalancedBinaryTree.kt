package easy

import kotlin.math.abs

class BalancedBinaryTree {
    var isBalanced = true
    fun isBalanced(root: TreeNode?): Boolean {
        root ?: return true
        findDepth(root)
        return isBalanced
    }

    private fun findDepth(node:TreeNode?): Int{
        if(node == null){
            return 0;
        }
        val left = findDepth(node!!.left)
        val right = findDepth(node!!.right)

        if(abs(left-right) > 1){
            isBalanced = false;
        }
        return maxOf(left,right)+1;
    }
}