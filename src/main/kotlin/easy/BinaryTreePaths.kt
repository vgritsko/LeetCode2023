package easy

class BinaryTreePaths {
    private val paths = mutableListOf<List<Int>>()
    fun binaryTreePaths(root: TreeNode?): List<String> {
        val path = mutableListOf<Int>()
        root?: return listOf<String>()
        addPath(root,path)
        return paths.map {
            it.joinToString ( separator = "->")
        }
    }
    private fun addPath (node: TreeNode?, path:MutableList<Int>){
        node?: return
        path.add(node.`val`!!)
        if(node?.left == null && node?.right == null){
            paths.add(path.toList())
            return
        } else{
            val leftList = mutableListOf<Int>()
            val rightList = mutableListOf<Int>()
            leftList.addAll(path)
            rightList.addAll(path)
            addPath(node?.left,leftList)
            addPath(node?.right,rightList)
        }
    }
}