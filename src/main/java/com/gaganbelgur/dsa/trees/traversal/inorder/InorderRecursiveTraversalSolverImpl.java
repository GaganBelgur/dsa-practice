package main.java.com.gaganbelgur.dsa.trees.traversal.inorder;

import main.java.com.gaganbelgur.dsa.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InorderRecursiveTraversalSolverImpl implements InOrderTraversalSolverInterface {
    @Override
    public List<Integer> inorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recursiveInorder(root, result);
        return result;
    }

    private void recursiveInorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        recursiveInorder(root.getLeft(), result);
        result.add(root.getData());
        recursiveInorder(root.getRight(), result);
    }
}
