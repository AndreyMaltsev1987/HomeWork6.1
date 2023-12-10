import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("Задание 2");
        int n = 20;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(41) - 10;
        }
        System.out.println("Массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int firstNegativeIndex = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }
        int sum = 0;
        for (int i = firstNegativeIndex + 1; i < n; i++) {
            sum += array[i];
        }
        System.out.println("Сумма элементов после первого отрицательного элемента: " + sum);
    }
}



