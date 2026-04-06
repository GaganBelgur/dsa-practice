package main.java.com.gaganbelgur.dsa.trees.maxdepth;

import main.java.com.gaganbelgur.dsa.trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class FindMaxDepthSolverImpl implements FindMaxDepthSolverInterface {
    @Override
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            depth+=1;
            for(int i=0; i<size;i++) {
                TreeNode node = queue.poll();
                if(node.getLeft() != null) queue.add(node.getLeft());
                if(node.getRight() != null) queue.add(node.getRight());
            }
        }

        return depth;
    }
}
