package org.joshua.ransom.solutions;

import org.joshua.ransom.Solution;
import org.joshua.ransom.solutions.utils.TreeNode;

public class InvertBinaryTree implements Solution<TreeNode, TreeNode> {

    @Override
    public TreeNode bruteForce(TreeNode input) {
        invertTree(input);
        return input;
    }

    private void invertTree(TreeNode input) {
        if (input == null) {
            return;
        }
        var temp = input.left;
        input.left = input.right;
        input.right = temp;
        invertTree(input.left);
        invertTree(input.right);
    }
}
