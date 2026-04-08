package main.java.com.gaganbelgur.dsa.trees.traversal.postorder;

import main.java.com.gaganbelgur.dsa.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PostOrderRecursiveTraversalSolverImpl implements PostOrderTraversalSolverInterface {
    @Override
    public List<Integer> postOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recursivePostOrder(root, result);
        return result;
    }

    private void recursivePostOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        recursivePostOrder(root.getLeft(), result);
        recursivePostOrder(root.getRight(), result);
        result.add(root.getData());
    }
}
