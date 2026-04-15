package main.java.com.gaganbelgur.dsa.trees.traversal;

import main.java.com.gaganbelgur.dsa.trees.NodeOrderPair;
import main.java.com.gaganbelgur.dsa.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AllTraversalInOneIterationSolverImpl implements AllTraversalInOneIterationSolverInterface {
    @Override
    public List<List<Integer>> treeTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        List<Integer> preorder = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();

        Stack<NodeOrderPair> stack = new Stack<>();
        stack.push(new NodeOrderPair(root, 1));

        while (!stack.isEmpty()) {
            NodeOrderPair pair = stack.pop();
            TreeNode node = pair.node;
            int order = pair.order;

            switch (order) {
                case 1:
                    preorder.add(node.getData());
                    stack.push(new NodeOrderPair(node, 2));
                    if (node.getLeft() != null) stack.push(new NodeOrderPair(node.getLeft(), 1));
                    break;

                case 2:
                    inorder.add(node.getData());
                    stack.push(new NodeOrderPair(node, 3));
                    if (node.getRight() != null) stack.push(new NodeOrderPair(node.getRight(), 1));
                    break;

                case 3:
                    postorder.add(node.getData());
                    break;
            }
        }
        result.add(inorder);
        result.add(preorder);
        result.add(postorder);
        return result;
    }
}
