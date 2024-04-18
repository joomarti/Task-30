import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("""
                2. Сиздер консольдон 2 орундуу сан киргизишиниздер керек, ошол\s
                санды сиздер математикалык турдоо консольго чыгарышыныздар\s
                керек\s
                Мисалы: \s
                \s
                Input: 34\s
                Output: 30 + 4\s
                \s
                Input: 49\s
                Output: 40 + 9""");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();






        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите двузначное число: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 99) {
            int tens = number / 10 * 10;
            int ones = number % 10;
            System.out.println("Output: " + tens + " + " + ones);
        } else {
            System.out.println("Вы ввели неверное число!");
        }
    }
}