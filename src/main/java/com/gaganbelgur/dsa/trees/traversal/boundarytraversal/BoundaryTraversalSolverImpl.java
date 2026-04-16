package main.java.com.gaganbelgur.dsa.trees.traversal.boundarytraversal;

import main.java.com.gaganbelgur.dsa.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversalSolverImpl implements BoundaryTraversalSolverInterface {
    @Override
    public List<Integer> boundary(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) return result;

        if (!isLeafNode(root)) result.add(root.getData());

        traverseLeftBoundary(root.getLeft(), result);
        traverseOnlyLeaves(root, result);
        traverseRightBoundary(root.getRight(), result);

        return result;
    }

    private void traverseLeftBoundary(TreeNode node, List<Integer> result) {
        while (node != null) {
            if (!isLeafNode(node))  result.add(node.getData());

            if (node.getLeft() != null) node = node.getLeft();
            else node = node.getRight();
        }
    }

    private void traverseRightBoundary(TreeNode node, List<Integer> result) {
        List<Integer> temp = new ArrayList<>();

        while (node != null) {
            if (!isLeafNode(node)) temp.add(node.getData());

            if (node.getRight() != null) node = node.getRight();
            else node = node.getLeft();
        }

        for (int i = temp.size() - 1; i >= 0; i--) {
            result.add(temp.get(i));
        }
    }

    private void traverseOnlyLeaves(TreeNode node, List<Integer> result) {
        if (node == null) return;

        if (isLeafNode(node)) {
            result.add(node.getData());
            return;
        }

        traverseOnlyLeaves(node.getLeft(), result);
        traverseOnlyLeaves(node.getRight(), result);
    }

    private boolean isLeafNode(TreeNode node) {
        return node.getLeft() == null && node.getRight() == null;
    }
}
