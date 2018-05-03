import com.sun.source.tree.BinaryTree
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BinaryTreeTest {

    @Test
    fun depthFirstSearchTest() {
        val tree = BinaryTree(listOf(9, 7, 12, 6, 15))
        assertTrue(tree.depthFirstSearch(7))
        assertTrue(tree.depthFirstSearch(12))
        assertTrue(tree.depthFirstSearch(6))
        assertFalse(tree.depthFirstSearch(14))
    }

    @Test
    fun breadthFirstSearchTest() {
        val tree = BinaryTree(listOf(9, 7, 12, 6, 15))
        assertTrue(tree.breadthFirstSearch(7))
        assertTrue(tree.breadthFirstSearch(12))
        assertTrue(tree.breadthFirstSearch(6))
        assertFalse(tree.breadthFirstSearch(14))
    }

}
