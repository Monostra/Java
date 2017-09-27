package repeat.simple_project;

import java.util.Scanner;

/**
 * Created by Mykhailo on 27/09/2017.
 */
public class Java_9_Rakushka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter count of row r: ");
        int r = scanner.nextInt();
        System.out.print("Enter count of column c: ");
        int c = scanner.nextInt();

        int[][] matrix = new int[r][c];
        int p = 1, j = 0, k = 0, i = 0;

        while (i < r * c) {
            k++;
            for (j = k - 1; j < c - k + 1; j++) {
                matrix[k - 1][j] = p++;
                i++;
            }
            if (i < r * c) {
                for (j = k; j < r - k + 1; j++) {
                    matrix[j][c - k] = p++;
                    i++;
                }
            }
            if (i < r * c) {
                for (j = c - k - 1; j >= k - 1; j--) {
                    matrix[r - k][j] = p++;
                    i++;
                }
            }
            if (i < r * c) {
                for (j = r - k - 1; j >= k; j--) {
                    matrix[j][k - 1] = p++;
                    i++;
                }
            }
        }

        for (int l = 0; l < r; l++) {
            for (int m = 0; m < c; m++) {
                System.out.print(matrix[l][m] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
