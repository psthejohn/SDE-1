package com.dsa.Array;

public class DAY1_Matrix_multiplication {
    public static void main(String[] args) {
        int[][] arr1 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] arr2 = new int[][] { { 7, 8, 9, 10 }, { 11, 12, 13, 14 }, { 15, 16, 17, 18 } };
        printer(matrixMultiplication(arr1, arr2));
    }

    private static void printer(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Matrix A (2x3)
    // A = [ [1, 2, 3],
    // [4, 5, 6] ]
    //
    // Matrix B (3x4)
    // B = [ [ 7, 8, 9, 10],
    // [11, 12, 13, 14],
    // [15, 16, 17, 18] ]
    //
    // Result (A × B) will be a 2x4 matrix:
    // C = [ [ 74, 80, 86, 92 ],
    // [ 173, 188, 203, 218 ] ]

    private static int[][] matrixMultiplication(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr2[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = 0;
                for (int k = 0; k < arr1[0].length; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return result;
    }

}
