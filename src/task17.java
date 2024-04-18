import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        System.out.println("""
                                
                \s
                18. Бир программа жазыныз, сиз торт орундуу оң сан бериниз, сиз\s
                текшеришиниз керек кайсыл орундагы саны чон экен, консольго\s
                чыгарышынз мисалы: биринчи сан 25 экинчи сан 35 тен чон, же экоо\s
                барабар болсо 25 жана 25 бири бирине барабар деп чыгарасыз""");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("san jaz");
            int a1 = scanner.nextInt();
            System.out.println("san ber");
            int a2 = scanner.nextInt();
            if (a1 > a2) {
                System.out.println(a1 + ":  chon");
            } else if (a2 > a1) {
                System.out.println(a2 + ":  chon");

            } else {
                System.out.println(":  ten sandar");
            }
        }
    }
}
