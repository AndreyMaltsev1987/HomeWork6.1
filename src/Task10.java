import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Задание 10");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of seats per row: ");
        int m = scanner.nextInt();
        int[][] seats = new int[n][m];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                seats[i][j] = random.nextInt(2);
            }
        }

        System.out.println("Original seating arrangement:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter the number of adjacent seats to sell: ");
        int k = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (seats[i][j] == 0) {
                    count++;
                    if (count == k) {
                        System.out.println("Seats available for sale in row " + (i + 1) + ":");
                        for (int l = j - k + 1; l <= j; l++) {
                            System.out.print("Seat " + (l + 1) + " ");
                        }
                        System.out.println();
                        found = true;
                        break;
                    }
                } else {
                    count = 0;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No adjacent seats available for sale.");
        }
    }
}


