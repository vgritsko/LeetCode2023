package easy

class SumLeftLeafes {
    var sumLeftNodes = 0
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        root ?: return 0
        traverseTree(root,false)
        return sumLeftNodes
    }

    private fun traverseTree (node:TreeNode, isLeft:Boolean) {
        if (isLeft && node.left == null && node.right == null){
            sumLeftNodes += node.`val`
        }
        node.left?.let { traverseTree(it, true) }
        node.right?.let { traverseTree(it,false) }
    }
}