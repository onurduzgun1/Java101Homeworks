package Java101Odevler.FindingMatrixTranspose;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class FindingMatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {{2, 3, 4}, {5, 6, 4}};

        System.out.println("Matrix: ");
        matrisPrint(matrix);
        System.out.println("\n" + "Transpose: ");
        matrisPrint(transpose(matrix));
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] transpos = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpos[j][i] = matrix[i][j];
            }
        }
        return transpos;
    }

    public static void matrisPrint(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
