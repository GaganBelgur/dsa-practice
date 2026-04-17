package main.java.com.gaganbelgur.dsa.trees.views;

import main.java.com.gaganbelgur.dsa.trees.TreeNode;
import main.java.com.gaganbelgur.dsa.trees.traversal.levelorder.LevelOrderTraversalSolverImpl;
import main.java.com.gaganbelgur.dsa.trees.traversal.levelorder.LevelOrderTraversalSolverInterface;

import java.util.ArrayList;
import java.util.List;

public class LeftAndRightViewSolverImpl {
    LevelOrderTraversalSolverInterface levelOrder = new LevelOrderTraversalSolverImpl();

    public List<Integer> leftView(TreeNode node) {
        List<List<Integer>> resultList = levelOrder.levelOrder(node);

        List<Integer> result = new ArrayList<>();
        for (List<Integer> list: resultList) {
            result.add(list.get(0));
        }

        return result;
    }

    public List<Integer> rightView(TreeNode node) {
        List<List<Integer>> resultList = levelOrder.levelOrder(node);

        List<Integer> result = new ArrayList<>();
        for (List<Integer> list: resultList) {
            result.add(list.get(list.size() - 1));
        }

        return result;
    }
}
