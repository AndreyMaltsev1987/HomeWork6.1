import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Задание 12");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();

        int[][] chessboard = new int[n][n];
        int currentNumber = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessboard[i][j] = 0;
            }
        }

        int row = 0;
        int col = 0;
        chessboard[row][col] = currentNumber;
        int[] moveRow = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] moveCol = {-1, 1, -2, 2, -2, 2, -1, 1};

        while (currentNumber < n * n) {
            int nextRow = -1;
            int nextCol = -1;
            int minMoves = 9;
            for (int i = 0; i < 8; i++) {
                int newRow = row + moveRow[i];
                int newCol = col + moveCol[i];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && chessboard[newRow][newCol] == 0) {
                    int numMoves = countPossibleMoves(chessboard, newRow, newCol, n);
                    if (numMoves < minMoves) {
                        minMoves = numMoves;
                        nextRow = newRow;
                        nextCol = newCol;
                    }
                }
            }
            if (nextRow == -1 || nextCol == -1) {
                System.out.println("Алгоритм работает неверно.");
                return;
            }

            currentNumber++;
            chessboard[nextRow][nextCol] = currentNumber;
            row = nextRow;
            col = nextCol;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-4d", chessboard[i][j]);
            }
            System.out.println();
        }
    }
    public static int countPossibleMoves(int[][] chessboard, int row, int col, int n) {
        int count = 0;

        int[] moveRow = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] moveCol = {-1, 1, -2, 2, -2, 2, -1, 1};

        for (int i = 0; i < 8; i++) {
            int newRow = row + moveRow[i];
            int newCol = col + moveCol[i];

            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && chessboard[newRow][newCol] == 0) {
                count++;
            }
        }

        return count;
    }
}



