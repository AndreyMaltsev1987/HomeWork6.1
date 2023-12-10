import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание 3");
            int n = 200;
            int[] array = new int[n];
            Random random = new Random();


            for (int i = 0; i < n; i++) {
                array[i] = random.nextInt(201);
            }


            System.out.println("Массив:");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

            int count1Digit = 0;
            int count2Digit = 0;
            int count3Digit = 0;

            for (int i = 0; i < n; i++) {
                if (array[i] < 10) {
                    count1Digit++;
                } else if (array[i] < 100) {
                    count2Digit++;
                } else {
                    count3Digit++;
                }
            }

            System.out.println("digit 1 = " + count1Digit);
            System.out.println("digit 2 = " + count2Digit);
            System.out.println("digit 3 = " + count3Digit);
        }
    }



