package main.java.com.gaganbelgur.dsa.trees.traversal.preorder;

import main.java.com.gaganbelgur.dsa.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderIterativeTraversalSolverImpl implements PreOrderTraversalSolverInterface {

    @Override
    public List<Integer> preorderTraversal(TreeNode root) {
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
