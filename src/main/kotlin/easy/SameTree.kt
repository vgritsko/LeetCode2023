package easy
//https://leetcode.com/problems/same-tree/
class SameTree {
    fun isSameTree(p: TreeNode?, q: TreeNode?) {
        fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
            if (p?.`val`!= q?.`val`) return false
            if (p == null && q == null) return true

            return isSameTree(p?.left, q?.left) && isSameTree(p?.right, q?.right)
        }
    }
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}