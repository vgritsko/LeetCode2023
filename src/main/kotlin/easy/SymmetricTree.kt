package easy

class SymmetricTree {
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) {
            return false
        } else {
            return isMirrored(root.left, root.right)
        }
    }

    fun isMirrored(leftNode: TreeNode?, rightNode: TreeNode?): Boolean {
        if (leftNode == null && rightNode == null) {
            return true
        }
        if (leftNode?.`val` == rightNode?.`val`) {
            return (isMirrored(leftNode?.left, rightNode?.right) && isMirrored(leftNode?.right, rightNode?.left))
        }
        return false
    }
}


