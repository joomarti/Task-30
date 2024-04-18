import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("jan jaz ");
            int a1 = scanner.nextInt();
            if (a1 > 100 && a1 < 999) {
                int a2 = a1 / 100;
                int a3 = a1 / 10 % 10;
                int a4 = a1 % 10;
                int a = 0;
                if (a2 == 0) {
                    a++;
                }
                if (a3 == 0) {
                    a++;
                }
                if (a4 == 0) {
                    a++;
                }
                if (a > 0) {
                    System.out.println("номер камтыйт");

                } else {
                    System.out.println("номерди камерди камтыбайт");
                }
            } else {
                System.out.println("уч орунду сан эмес");
            }
        }
    }
}

