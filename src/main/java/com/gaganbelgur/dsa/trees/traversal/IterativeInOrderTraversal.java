package main.java.com.gaganbelgur.dsa.trees.traversal;

import main.java.com.gaganbelgur.dsa.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeInOrderTraversal {

    public List<Integer> inorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        TreeNode node = root;

        while(true) {
            if(node != null) {
                stack.push(node);
                node = node.getLeft();
            } else {
                if(stack.isEmpty())  break;
                node = stack.pop();
                result.add(node.getData());
                node = node.getRight();
            }
        }

        return result;
    }
}
