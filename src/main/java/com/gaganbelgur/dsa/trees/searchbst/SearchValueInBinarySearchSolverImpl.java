package main.java.com.gaganbelgur.dsa.trees.searchbst;

import main.java.com.gaganbelgur.dsa.trees.TreeNode;

public class SearchValueInBinarySearchSolverImpl implements SearchValueInBinarySearchSolverInterface {
    @Override
    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null && root.getData() != val) {
            if(root.getData() > val) root = root.getLeft();
            else root = root.getRight();
        }
        return root;
    }
}
