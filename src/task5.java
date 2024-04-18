import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println("""
                \s
                6. Напишите программу, который принимает с клавиатуры целое\s
                положительное трехзначное число. Затем следует построить новое\s
                значение, составленное\s
                из цифр числа, введенного с клавиатуры, но в обратном\s
                порядке. После этого новое значение следует уменьшить на 20, и\s
                окончательныйрезультат вывести на экран.\s
                \s
                Мисалы:\s
                \s
                Input: 327\s
                Output: 703""");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите  trri число: ");
        int number = scanner.nextInt();
            int aa2 =  number-20;
        if (number >= 100 && number <= 999) {
            int tens = aa2 / 100;
            int ones = aa2 %10;
            int a1 = aa2%10;
            System.out.println( + a1 + "  " + (ones)+"  "+(tens));
        } else {
            System.out.println("Вы ввели неверное число!");

        }
    }
}
