package main.java.com.gaganbelgur.dsa.trees.serializeanddeserialize;

import main.java.com.gaganbelgur.dsa.trees.TreeNode;

public interface StringToTreeNodeSerializationAndDeserializationInterface {

    String serialize(TreeNode root);

    TreeNode deserialize(String data);
}
