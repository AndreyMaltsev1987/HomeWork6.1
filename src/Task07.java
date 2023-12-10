import java.util.Random;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        System.out.println("Задание 7");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square array: ");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt();
            }
        }

        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int minElement = array[0][0];
        int maxElement = array[0][0];
        int minCount = 1;
        int maxCount = 1;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] < minElement) {
                    minElement = array[i][j];
                    minCount = 1;
                } else if (array[i][j] == minElement) {
                    minCount++;
                }

                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                    maxCount = 1;
                } else if (array[i][j] == maxElement) {
                    maxCount++;
                }
            }
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Minimum element: " + minElement);
        System.out.println("Maximum element: " + maxElement);

        if (minCount > 1) {
            System.out.println("Indices of rows and columns with repeated minimum elements:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (array[i][j] == minElement) {
                        System.out.println("Row: " + i + ", Column: " + j);
                    }
                }
            }
        }
        if (maxCount > 1) {
            System.out.println("Indices of rows and columns with repeated maximum elements:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (array[i][j] == maxElement) {
                        System.out.println("Row: " + i + ", Column: " + j);
                    }
                }
            }
        }

        System.out.println("Execution time: " + executionTime + " milliseconds");
    }
}




