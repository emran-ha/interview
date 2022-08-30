package problemsolving;

import java.util.Random;
/*
*
* You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
* DO NOT allocate another 2D matrix and do the rotation.



Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
*
* */
class RotateMatrix {
    int[][] transpose(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            int[] row = matrix[i];
            for (int j = i; j < row.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
    int[][] swap(int[][] matrix){
        int k = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[j][k];
                matrix[j][k] = temp;
            }
            k--;
            if(k <= i){
                break;
            }
        }
        return matrix;
    }
    void display(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++){
                System.out.print(matrix[i][j]+"   ");
            }
            System.out.println();
        }
    }



    static public void main(String[] args) {
        int n = 4;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Random r = new Random();
                matrix[i][j] = r.nextInt(9);
            }
        }
        RotateMatrix rotateMatrix = new RotateMatrix();
        rotateMatrix.display(matrix);
        System.out.println();
        matrix = rotateMatrix.transpose(matrix);
        rotateMatrix.display(matrix);
        System.out.println();
        matrix = rotateMatrix.swap(matrix);
        rotateMatrix.display(matrix);
    }
}
