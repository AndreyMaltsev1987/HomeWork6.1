import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("задание 11");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 0 до 1 000 000: ");
        int number = scanner.nextInt();

        String result = numberToWords(number);
        System.out.println(result);
    }

    public static String numberToWords(int number) {
        if (number == 0) {
            return "ноль";
        }

        String[] units = {
                "", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять",
                "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать",
                "семнадцать", "восемнадцать", "девятнадцать"
        };

        String[] tens = {
                "", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"
        };

        String[] hundreds = {
                "", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"
        };

        String[] thousands = {
                "", "тысяча", "тысячи", "тысяч"
        };

        StringBuilder sb = new StringBuilder();

        int millions = number / 1_000_000;
        int thousand = (number / 1_000) % 1_000;
        int remainder = number % 1_000;

        if (millions > 0) {
            sb.append(numberToWords(millions)).append(" миллион ");
        }

        if (thousand > 0) {
            sb.append(formatNumber(thousand, hundreds, thousands)).append(" ");
        }

        if (remainder > 0) {
            sb.append(formatNumber(remainder, hundreds, units)).append(" ");
        }

        return sb.toString().trim();
    }

    public static String formatNumber(int number, String[] hundreds, String[] units) {
        StringBuilder sb = new StringBuilder();

        int hundredsDigit = number / 100;
        int tensDigit = (number / 10) % 10;
        int unitsDigit = number % 10;

        if (hundredsDigit > 0) {
            sb.append(hundreds[hundredsDigit]).append(" ");
        }

        if (tensDigit > 1) {
            sb.append(units[tensDigit]).append(" ");
            if (unitsDigit > 0) {
                sb.append(units[unitsDigit]).append(" ");
            }
        } else if (tensDigit == 1) {
            sb.append(units[number % 100]).append(" ");
        } else if (unitsDigit > 0) {
            sb.append(units[unitsDigit]).append(" ");
        }

        return sb.toString().trim();
    }
}


