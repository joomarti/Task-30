import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        System.out.println("""
                14. Бир программа жазыныз, сиз клавиатурадан эки сан беришиниз\s
                керек, биринчи сан окуучулардын саны, экинчи отургучтардын саны.\s
                Сиздер текшеришиниздер керек окуучуларга орун жетеби же\s
                жетпейби.\s
                \s
                Мисалы\s
                \s
                Input: 25 30\s""");
        Scanner scanner =  new Scanner(System.in);
        System.out.println("okuuchu");
        int a1 = scanner.nextInt();
        System.out.println("parta");
        int a2 =  scanner.nextInt();
        if (a1>a2 ){
            System.out.println((a1-a2)+":  okuushu ashuk");
        } else if (a2>a1) {
            System.out.println((a2-a1)+":  parta ashyk");
        } else   {
            System.out.println("barabar");

        }
    }
}
