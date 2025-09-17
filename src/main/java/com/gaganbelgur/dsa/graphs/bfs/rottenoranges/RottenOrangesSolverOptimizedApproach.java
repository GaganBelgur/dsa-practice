package main.java.com.gaganbelgur.dsa.graphs.bfs.rottenoranges;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrangesSolverOptimizedApproach implements RottenOrangesSolverInterface {

    @Override
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int freshOranges = 0;

        int[][] visitedMatrix = new int[rows][columns];
        Queue<RottenOranges> queue = new LinkedList<>();
        for(int i=0;i<rows;i++) {
            for(int j=0;j<columns;j++) {
                if(grid[i][j] == 2) {
                    visitedMatrix[i][j] = 1;
                    queue.add(new RottenOranges(i, j, 0));
                } else {
                    if(grid[i][j] == 1) freshOranges++;
                    visitedMatrix[i][j] = 0;
                }
            }
        }

        int minutes = 0;
        int[] dRows = {0, -1, 0, 1};
        int[] dCols = {-1, 0, 1, 0};

        while (!queue.isEmpty()) {
            RottenOranges rottenOranges = queue.poll();
            int row = rottenOranges.row;
            int column = rottenOranges.col;
            int time = rottenOranges.time;
            minutes = Math.max(minutes, time);

            for (int i = 0; i < 4; i++) {
                int newRow = row + dRows[i];
                int newColumn = column + dCols[i];

                if (newRow >= 0
                        && newRow < rows
                        && newColumn >= 0
                        && newColumn < columns
                        && visitedMatrix[newRow][newColumn] == 0
                        && grid[newRow][newColumn] == 1) {
                    freshOranges--;
                    visitedMatrix[newRow][newColumn] = 1;
                    queue.add(new RottenOranges(newRow, newColumn, time + 1));
                }
            }
        }
        return freshOranges == 0 ? minutes : -1;
    }
}
