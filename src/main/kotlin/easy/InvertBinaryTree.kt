package easy
//226. Invert Binary Tree
class SolutionInvertBinaryTree {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }
        val temp: TreeNode? = root.left
        root.left = invertTree(root.right)
        root.right = invertTree(temp)
        return root
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}