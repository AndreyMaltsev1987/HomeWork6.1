import java.util.Random;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Задание 5");

        int n = 20;
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(31) - 10;
        }

        System.out.println("Исходный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int maxConsecutivePositive = 0;
        int currentConsecutivePositive = 0;
        int startIndex = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                currentConsecutivePositive++;
                if (currentConsecutivePositive > maxConsecutivePositive) {
                    maxConsecutivePositive = currentConsecutivePositive;
                    startIndex = i - maxConsecutivePositive + 1;
                }
            } else {
                currentConsecutivePositive = 0;
            }
        }
        System.out.println("Найденный фрагмент:");
        for (int i = startIndex; i < startIndex + maxConsecutivePositive; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}




