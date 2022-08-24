package problemsolving;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class RotateDiagonalMatrix {


    int[][] transpose(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            int[] row = matrix[i];
            for (int j = i; j < row.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
            System.out.println();
        }
        return matrix;
    }

    int[][] rotate(int[][] matrix){
        List<Integer> diag1 = new LinkedList<Integer>();
        List<Integer> diag2 = new LinkedList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    diag1.add(matrix[i][j]);
                }
                if (j + i == matrix.length - 1) {
                    diag2.add(matrix[i][j]);
                }
            }
        }
        Collections.reverse(diag2);
//        System.out.println(diag1);
//        System.out.println(diag2);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                   matrix[i][j] = diag2.get(i);
                }
                if (j + i == matrix.length - 1) {
                    matrix[i][j] = diag1.get(i);
                }
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



    public static void main(String[] args) {
        //int[][] matrix = {{1,2},{4,5}};
        int n = 5;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Random r = new Random();
                matrix[i][j] = r.nextInt(100);
            }
        }
        RotateDiagonalMatrix rotateMatrix = new RotateDiagonalMatrix();
        rotateMatrix.display(matrix);
        matrix = rotateMatrix.rotate(matrix);
        System.out.println();
        rotateMatrix.display(matrix);
    }
}
