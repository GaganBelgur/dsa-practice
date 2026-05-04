package main.java.com.gaganbelgur.dsa.binarysearch.maximizesweetness;

/*
You have one chocolate bar that consists of some chunks.
Each chunk has its own sweetness given by the array sweetness.
You want to share the chocolate with your k friends so you start cutting the chocolate bar into k + 1
pieces using k cuts, each piece consists of some consecutive chunks.
Being generous, you will eat the piece with the minimum total sweetness and give the other pieces to your friends.

Find the maximum total sweetness of the piece you can get by cutting the chocolate bar optimally.

Example 1
Input: sweetness = [1,2,3,4,5,6,7,8,9], k = 5
Output: 6

Explanation: You can divide the chocolate to [1,2,3], [4,5], [6], [7], [8], [9]
*/
public interface MaximizeSweetnessSolverInterface {
    int maximizeSweetness(int[] sweetness, int k);
}
