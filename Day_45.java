/** Check Whether a Matrix is Sparse or Dense
Sparse matrix: more than half of its elements are zero.
Dense matrix: half or fewer elements are zero. **/

import java.util.*;
class SparseDense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] a = new int[rows][cols];
        int zeroCount = 0;

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();

                if (a[i][j] == 0) {
                    zeroCount++;
                }
            }
        }

        int total = rows * cols;

        if (zeroCount > total / 2.0) {
            System.out.println("Sparse Matrix");
        } else {
            System.out.println("Dense Matrix");
        }
    }
}
