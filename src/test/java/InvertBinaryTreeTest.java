import org.joshua.ransom.solutions.InvertBinaryTree;
import org.joshua.ransom.solutions.utils.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InvertBinaryTreeTest {
    @Test
    void testInvertBinaryTree() {
        var invertBinaryTree = new InvertBinaryTree();
        var root = new TreeNode(4);
        root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        root.right = new TreeNode(7, new TreeNode(6), new TreeNode(9));
        var result = new TreeNode(4);
        result.left = new TreeNode(7, new TreeNode(9), new TreeNode(6));
        result.right = new TreeNode(2, new TreeNode(3), new TreeNode(1));

        var solution = invertBinaryTree.bruteForce(root);
        assertTrue(equalsTrees(solution, result));
    }

    private static boolean equalsTrees(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        return (node1.val == node2.val) &&
                equalsTrees(node1.left, node2.left) &&
                equalsTrees(node1.right, node2.right);
    }
}
