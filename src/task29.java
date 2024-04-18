import java.util.Random;
import java.util.Scanner;

public class task29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("San beriniz: ");
        Random ran = new Random();

        int num1 = scan.nextInt();

        int ranNum = ran.nextInt(1,100);
        System.out.println("Random tandagan san: " + ranNum);

        System.out.println(ranNum + " = " + num1);
        System.out.println();

        if (num1 == ranNum) {
            System.out.println("Okuuchu tapty");
        } else {
            System.out.println("Okuuchu tapbady");
        }


    }
}




