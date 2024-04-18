import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        System.out.println("""
                12. Трехзначное положительное число называется «четно-
                красивым», если каждая из его цифр - четная. Напишите класс,\s
                который принимает с клавиатуры трехзначное число и проверяет,\s
                является ли оно «четнокрасивым». В соответствии с результатом\s
                проверки надо вывести на экран соответствующее текстовое\s
                сообщение. Обратите внимание: задание имеет решение с\s
                использованием одного оператора if и без составного условия!""");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();

        if ((number / 100) % 2 == 0 && ((number / 10) % 10) % 2 == 0 && (number % 10) % 2 == 0) {
            System.out.println("tak san");
        } else {
            System.out.println("jup san");
        }
    }
}



