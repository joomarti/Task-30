import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("""
                \s
                \s
                1. Сиздер консольдон уч орундуу сан бересиздер, ошол санды\s
                сиздер наобороттун чыгарып жана ортосунан болуп салышынздар\s
                керек \s
                Мисалы: \s
                \s
                Input:  457\s
                Output: 7 5 4\s""");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = a1/100;
        int a3 = a1/10%10;
        int a4 =  a1%10;
        System.out.println(a4+" "+a3+" "+a2);


        }
    }
