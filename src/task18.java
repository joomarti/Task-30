import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        System.out.println("""
                19. Трехзначное число называется «дважды четным», если и оно\s
                само, и сумма его цифр - четные.\s
                Напишите класс, который принимает с клавиатуры трехзначное\s
                положительное число и проверяет, является ли оно «дважды\s
                четным». В соответствии с результатом проверки надо вывести на\s
                экран соответствующее\s
                текстовое сообщение""");
        Scanner scanner = new Scanner(System.in);

        System.out.print("уч орунду он сан киргизиниз: ");
        int number = scanner.nextInt();

        if (number >= 100 && number <= 999) {
            int digit1 = number / 100;
            int digit2 = (number / 10) % 10;
            int digit3 = number % 10;

            if ((number % 2 == 0) && ((digit1 + digit2 + digit3) % 2 != 0)) {
                System.out.println("сан эки эсе жуп эмес");
            } else {
                System.out.println("сан эки эсе жуп ");
            }
        } else {
            System.out.println("сан уч орунду эмес");
        }
    }
}




