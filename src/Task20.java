import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("sn jaz ");
//            int a1 = scanner.nextInt();
//
//            if (a1 > 10 && a1 < 99) {
//                System.out.println("eki orundu san: " + (a1 + 4));
//            } else if (a1 > 100 && a1 < 999) {
//                System.out.println("uch orundu san:  " + (a1 + 3));
//
//            }
//
//        }
//    }
//}
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите положительное целое число: ");
        int number = scanner.nextInt();
        int nearestRoundDown = (number / 10) * 10;
        int nearestRoundUp = nearestRoundDown + 10;
        if (number - nearestRoundDown < nearestRoundUp - number) {
            System.out.println("Ближайшее крутое число: " + nearestRoundDown);
        } else {
            System.out.println("Ближайшее крутое число: " + nearestRoundUp);
        }
    }
}
