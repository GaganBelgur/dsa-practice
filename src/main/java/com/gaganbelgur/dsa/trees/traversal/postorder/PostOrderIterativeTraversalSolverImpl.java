package main.java.com.gaganbelgur.dsa.trees.traversal.postorder;

import main.java.com.gaganbelgur.dsa.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Use stack1 to traverse
Push nodes into stack2 in modified preorder (Root → Right → Left)
Reverse gives Left → Right → Root
*/
public class PostOrderIterativeTraversalSolverImpl implements PostOrderTraversalSolverInterface {

    @Override
    public List<Integer> postOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);

            if (node.getLeft() != null) stack1.push(node.getLeft());
            if (node.getRight() != null) stack1.push(node.getRight());
        }

        while (!stack2.isEmpty()) {
            result.add(stack2.pop().getData());
        }

        return result;
    }
}
