public class Task01 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int n = 10;
        int[] squares = new int[n];
        for (int i = 0; i < n; i++) {
            squares[i] = i * i;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(squares[i] + " ");
        }
    }
}




