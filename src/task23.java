import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("san jaz");
            int a1 = scanner.nextInt();
            switch (a1) {
                case 1, 2, 12:
                    System.out.println("kush mezgili");
                    break;
                case 3, 4, 5:
                    System.out.println("jaz");
                    break;
                case 6, 7, 8:
                    System.out.println("jai");
                    break;
                case 9, 10, 11:
                    System.out.println("kuz");
                    break;
                default:
                    System.out.println("myndai san jok");
            }
        }
    }}

