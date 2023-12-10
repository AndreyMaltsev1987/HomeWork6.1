import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Задание 4");
        int n = 100;
        int[] originalArray = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            originalArray[i] = random.nextInt(856) - 300;
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println();
        int[] resultArray = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (originalArray[i] > 0) {
                resultArray[index] = originalArray[i];
                index++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (originalArray[i] == 0) {
                resultArray[index] = originalArray[i];
                index++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (originalArray[i] < 0) {
                resultArray[index] = originalArray[i];
                index++;
            }
        }
        System.out.println("Результирующий массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(resultArray[i] + " ");
        }
        System.out.println();
    }
}





