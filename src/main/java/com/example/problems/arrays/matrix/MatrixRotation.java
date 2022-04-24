/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.matrix;

public class MatrixRotation {
    public void rotate(int[][] matrix) {
        final int n = matrix.length;
        
        for(int i = 0; i < (n+1) / 2; i++){
            for(int j = 0 ; j < n/2 ; j++){
                int temp = matrix[n - 1 - j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = matrix[i][j];
                matrix[i][j] = temp;
                
                //System.out.format("matrix[%d][%d] = %d\n", i, j, matrix[i][j]);
            }
        }
    }
}
