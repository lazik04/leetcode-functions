package uz.pdp.medium;
//1975. Maximum Matrix Sum
//        Medium
//Topics
//        Companies
//Hint
//You are given an n x n integer matrix. You can do the following operation any number of times:
//
//Choose any two adjacent elements of matrix and multiply each of them by -1.
//Two elements are considered adjacent if and only if they share a border.
//
//Your goal is to maximize the summation of the matrix's elements.
// Return the maximum sum of the matrix's elements using the operation mentioned above.

public class MaximumMatrixSum {
    public long maxMatrixSum(int[][] matrix) {
        long s = 0;
        int r = matrix.length;
        int c = matrix[0].length;
        int m = Integer.MAX_VALUE;
        boolean n = false;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int v = matrix[i][j];
                if (v < 0) {
                    n = !n;
                    v = -v;
                }
                s += v;
                if (v < m) {
                    m = v;
                }
            }
        }
        if (n) return s - m * 2;
        return s;
    }

}
