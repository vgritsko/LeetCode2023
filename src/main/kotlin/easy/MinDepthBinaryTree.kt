package easy

class MinDepthBinaryTree {
    class Solution {
        fun minDepth(root: TreeNode?): Int {
            root ?: return 0
            if (root!!.left == null && root!!.right == null) return 1
            if (root!!.left == null) return minDepth(root!!.right) + 1
            if (root!!.right == null) return minDepth(root!!.left) +1
            return minOf(minDepth(root!!.left),minDepth(root!!.right)) +1
        }
    }
}