package main.java.com.gaganbelgur.dsa.trees.views;

import main.java.com.gaganbelgur.dsa.trees.TreeNode;

import java.util.*;

public class RightViewSolverImpl implements BinaryTreesViewSolverInterface {
    @Override
    public List<Integer> view(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if(node == null) break;
                if (i == size - 1) result.add(node.getData());
                if (node.getLeft() != null) queue.add(node.getLeft());
                if (node.getRight() != null) queue.add(node.getRight());
            }
        }

        return result;
    }
}
