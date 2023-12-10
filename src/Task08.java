import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        System.out.println("Задание 8");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square array: ");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];

        int value = 1;
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;

        while (value <= n * n) {

            for (int i = colStart; i <= colEnd; i++) {
                array[rowStart][i] = value++;
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                array[i][colEnd] = value++;
            }
            colEnd--;

            for (int i = colEnd; i >= colStart; i--) {
                array[rowEnd][i] = value++;
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                array[i][colStart] = value++;
            }
            colStart++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-4d", array[i][j]);
            }
            System.out.println();
        }
    }
}

