import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("san jaz");
            int number = scanner.nextInt();

            int a1 = number / 100;
            int a2 = number / 10 % 10;
            int a3 = number % 10;

            int i = 1;

            if (a1 != a2 && a1 != a3) {
                i++;
            }
            if (a2 != a3) {
                i++;
            }

            System.out.println("san: " + i);
        }
}}
