class BinaryTree {
    private var root: Node

    constructor(rootVal: Int) {
        root = Node(rootVal)
    }

    fun insert(value: Int) = insertRecursive(root, value)

    private fun insertRecursive(node: Node, value: Int) {
        if (value < node.value)
            if (node.left == null) node.left = Node(value)
            else insertRecursive(node.left!!, value)
        else
            if (node.right == null) node.right = Node(value)
            else insertRecursive(node.right!!, value)
    }

    fun depthFirstSearch(value: Int) = dfsRecursive(root, value)

    private fun dfsRecursive(node: Node?, value: Int): Boolean {
        if(node == null) return false
        if(node.value == value) return true
        if(dfsRecursive(node.left, value)) return true
        if(dfsRecursive(node.right, value)) return true
        return false
    }

    fun inOrderTraversal() = iotRecursive(root)

    private fun iotRecursive(node: Node?): List<Int> =
        if(node == null) emptyList()
        else iotRecursive(node.left)
                .union(listOf(node.value))
                .union(iotRecursive(node.right)
                .toList())
                .toList()
}

data class Node(var value: Int) {
    var left: Node? = null
    var right: Node? = null
}