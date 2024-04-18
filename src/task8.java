import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        System.out.println("""
             
              
                9. Напишите программу, который принимает с клавиатуры целое\s
                число и выводит на экран одно из следующих сообщений:\s
                “Положительное”, или “Отрицательное”, или “Ноль”, - в зависимости\s
                от значения числа""");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Положительное");
        } else if (number < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Ноль");
        }
    }
}
