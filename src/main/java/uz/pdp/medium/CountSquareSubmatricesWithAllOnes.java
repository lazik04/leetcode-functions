package uz.pdp.medium;

//1277. Count Square Submatrices with All Ones
//Medium
//        Topics
//Companies
//        Hint
//Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.
public class CountSquareSubmatricesWithAllOnes {
    public int countSquares(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        for (int i = 1; i < rowSize; i++) {
            for (int j = 1; j < colSize; j++) {
                if (matrix[i][j] == 1)
                    matrix[i][j] += Math.min(matrix[i - 1][j], Math.min(matrix[i - 1][j - 1], matrix[i][j - 1]));
            }
        }

        int total = 0;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                total += matrix[i][j];
            }
        }

        return total;
    }
}
