package main.java.com.gaganbelgur.dsa.trees.traversal.spiral;

import main.java.com.gaganbelgur.dsa.trees.TreeNode;

import java.util.*;

public class SpiralTraversalSolverImpl implements SpiralTraversalSolverInterface {
    @Override
    public List<List<Integer>> spiralTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse = false;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.getData());

                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }

                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }

            if(reverse) {
                Collections.reverse(list);
            }
            reverse = !reverse;

            result.add(list);
        }

        return result;
    }
}
