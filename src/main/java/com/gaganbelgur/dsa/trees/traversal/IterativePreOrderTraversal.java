package main.java.com.gaganbelgur.dsa.trees.traversal;

import main.java.com.gaganbelgur.dsa.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePreOrderTraversal {

    public List<Integer> preorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.getData());
            if(node.getRight() != null) {
                stack.push(node.getRight());
            }

            if(node.getLeft() != null) {
                stack.push(node.getLeft());
            }
        }

        return result;
    }
}
