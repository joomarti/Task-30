import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        System.out.println("""
                25. Напишите класс, который читает с клавиатуры символ и\s
                проверяет, является ли введенный символ буквой латинского\s
                алфавита. По результатам проверки следует вывести на экран\s
                соответствующее сообщение.\s""");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napishite simvol: ");
        char simvol = scanner.next().charAt(0);

        if ((simvol >= 'a' && simvol <= 'z') || (simvol >= 'A' && simvol <= 'Z')) {
            System.out.println("Eto bukva latinskogo alfavita");

        } else {
            System.out.println("Eto ne bukva latinskogo alfavita");
        }


        }
    }












