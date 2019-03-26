package q1;

import java.util.Arrays;

public class NbyN {
    public static int[][] nbyn(int N) {
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    matrix[i][j] = j;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) throws Exception {
        int[][] diagonalMatrix = new int[10][10];
        diagonalMatrix = nbyn(10);
        System.out.println(Arrays.deepToString(diagonalMatrix).replace("],", "],\n"));
    }
}