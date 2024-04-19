import java.util.Random;
import java.util.Scanner;

public class task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinchi sandy jaz");
        int number1 = scanner.nextInt();
        System.out.println("Ekinchi sandy jaz");
        int number2 = scanner.nextInt();
        Random random = new Random();
        int randomNumber = random.nextInt(number1, number2);
        System.out.println("Salyshtyrgany san jaz " + number1 + " sandan " + number2 + " sanga cheiin");
        int number3 = scanner.nextInt();
        if (number3 == randomNumber) {
            System.out.println("Okuuchu sandy tuura tapty");
        } else {
            System.out.println("Okuuchu sandy tuura tapkan jok");
        }
        System.out.println("Okuuchu tandagan san " + number3 + " kokus san " + randomNumber);


    }
}




