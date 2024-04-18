import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        System.out.println("""
             
                13. Бир программа жазыныздар, ал программа консольдон 2\s
                орундуу сан алыш керек, бир гана if менен текшериш керек сандын\s
                1 оруну жана 2 орунунун кобойтуусу чонбу же сан озубу \s
                \s
                Мисалы:\s
                \s
                Input: 25\s
                Output: 25>10   """);

        Scanner scanner = new Scanner(System.in);
        int a1 =scanner.nextInt();
        int a2 =  scanner.nextInt();
        if (a1>a2){
            System.out.println(a1+">"+a2);
        }else if (a2>a1){
            System.out.println(a2+">"+a1);
        }else {
            System.out.println("barabar");
        }
    }
}

