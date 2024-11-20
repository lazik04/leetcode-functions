package uz.pdp.medium;
//2684. Maximum Number of Moves in a Grid
//        Medium
//Topics
//        Companies
//Hint
//You are given a 0-indexed m x n matrix grid consisting of positive integers.
//
//You can start at any cell in the first column of the matrix, and traverse the grid in the following way:
//
//From a cell (row, col), you can move to any of the cells: (row - 1, col + 1), (row, col + 1) and (row + 1, col + 1) such that the value of the cell you move to, should be strictly bigger than the value of the current cell.
//Return the maximum number of moves that you can perform.
//

public class MaximumNumberOfMovesInGrid {

    int res = 0;
    int rows, cols;

    public int maxMoves(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            dfs(i, 0, grid);
        }
        return res;
    }

    private void dfs(int i, int j, int[][] grid) {
        res = Math.max(res, j);
        if (res == cols - 1) return;

        for (int d = -1; d <= 1; d++) {
            int ni = i + d;
            if (ni >= 0 && ni < rows && grid[ni][j + 1] > grid[i][j]) {
                dfs(ni, j + 1, grid);
            }
        }
        grid[i][j] = 0;  // Mark as visited
    }
}
