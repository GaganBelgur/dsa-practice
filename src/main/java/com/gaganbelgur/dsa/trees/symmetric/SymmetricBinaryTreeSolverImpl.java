package main.java.com.gaganbelgur.dsa.trees.symmetric;

import main.java.com.gaganbelgur.dsa.trees.TreeNode;

public class SymmetricBinaryTreeSolverImpl implements SymmetricBinaryTreeSolverInterface {
    @Override
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        return isSymmetric(root.getLeft(), root.getRight());
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true; // Both nodes are null, so symmetric
        if(left == null || right == null) return false; // One of the nodes is null, so not symmetric
        if(left.getData() != right.getData()) return false; // The values of the nodes do not match, so not symmetric

        return isSymmetric(left.getLeft(), right.getRight()) && isSymmetric(left.getRight(), right.getLeft());
    }
}
