package main.java.com.gaganbelgur.dsa.trees.views;

import main.java.com.gaganbelgur.dsa.trees.NodeOrderPair;
import main.java.com.gaganbelgur.dsa.trees.TreeNode;

import java.util.*;

public class TopViewSolverImpl implements BinaryTreesViewSolverInterface {
    @Override
    public List<Integer> view(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<NodeOrderPair> queue = new LinkedList<>();
        queue.add(new NodeOrderPair(root, 0));

        while(!queue.isEmpty()) {
            NodeOrderPair pair = queue.poll();
            TreeNode node = pair.node;
            int order = pair.order;

            if(!map.containsKey(order)) map.put(order, node.getData());

            if(node.getLeft() != null) queue.add(new NodeOrderPair(node.getLeft(), order - 1));
            if(node.getRight() != null) queue.add(new NodeOrderPair(node.getRight(), order + 1));
        }
        result.addAll(map.values());
        return result;
    }
}
