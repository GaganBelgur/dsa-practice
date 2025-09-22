package main.java.com.gaganbelgur.dsa.trees.traversal;

import main.java.com.gaganbelgur.dsa.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Preorder {

    public List<Integer> preorderTraversal(TreeNode node) {
        List<Integer> result = new ArrayList<>();
        if(node == null) return result;

        preorderTraversalInternal(node, result);
        return result;
    }

    private void preorderTraversalInternal(TreeNode node, List<Integer> traversalNode) {
        if(node == null) return;

        traversalNode.add(node.getData());
        preorderTraversalInternal(node.getLeft(), traversalNode);
        preorderTraversalInternal(node.getRight(), traversalNode);
    }
}
