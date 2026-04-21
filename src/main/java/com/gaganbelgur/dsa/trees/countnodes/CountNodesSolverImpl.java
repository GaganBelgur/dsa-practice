package main.java.com.gaganbelgur.dsa.trees.countnodes;

import main.java.com.gaganbelgur.dsa.trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CountNodesSolverImpl implements CountNodesSolverInterface {
    @Override
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int count = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node == null) continue;
                list.add(node.getData());

                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }

                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }

            count += list.size();
        }

        return count;
    }
}
