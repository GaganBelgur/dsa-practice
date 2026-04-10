package main.java.com.gaganbelgur.dsa.trees.serializeanddeserialize;

import main.java.com.gaganbelgur.dsa.trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class StringToTreeNodeSerializationAndDeserializationImpl implements StringToTreeNodeSerializationAndDeserializationInterface {
    @Override
    public String serialize(TreeNode root) {
        if (root == null) return "";

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node == null) {
                sb.append("#,");
                continue;
            }

            sb.append(node.getData()).append(",");
            queue.offer(node.getLeft());
            queue.offer(node.getRight());
        }

        return sb.toString();
    }

    @Override
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) return null;

        String[] values = data.split(",");
        int i = 0;

        TreeNode root = new TreeNode(Integer.parseInt(values[i++]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (!values[i].equals("#")) {
                node.setLeft(new TreeNode(Integer.parseInt(values[i])));
                queue.offer(node.getLeft());
            }

            i++;

            if (!values[i].equals("#")) {
                node.setRight(new TreeNode(Integer.parseInt(values[i])));
                queue.offer(node.getRight());
            }

            i++;
        }

        return root;
    }
}
