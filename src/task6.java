import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите  trri число: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 500) {
            int tens = number / 100;
            int ones = number / 10 % 10;
            int a1 = number % 10;
            System.out.println("Output: " + tens + " + " + ones + "  " + a1 +"  =  "+ (tens + ones + a1));
        } else {
            System.out.println("Вы ввели неверное число!");

        }
    }
}