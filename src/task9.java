import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        System.out.println("""
                10. Напишите программу, который принимает с клавиатуры целое
                        положительное число и, если оно как минимум трехзначное и
                        положительное, уменьшает его на 1.
                                
                        Мисалы:
                                
                        Input: 332
                        Output: 331""\");""");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите  trri число: ");
        int number = scanner.nextInt();
        if (number >= 10 && number <= 99) {
            int tens = number / 10;
            int ones = number %10;
            System.out.println(  tens + "  " + (ones-1)+"  ");
        } else {
            System.out.println("Вы ввели неверное число!");

        }

    }
}
