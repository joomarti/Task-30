import javax.lang.model.element.Name;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        System.out.println("""
                11. Напишите программу, который принимает с клавиатуры два\s
                целых числа и, если первое больше второго, выводит на экран их\s
                сумму, если же наоборот - выводит на экран их произведение. В\s
                случае же, если числа одинаковы, программа выводит на экран\s
                сообщение Числа равны.\s""");
        while (true) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("birinchi san");
            int a1 = scanner1.nextInt();
            System.out.println("ekinchi san");
            int a2 = scanner1.nextInt();
            if (a1 > a2) {
                int s2 = a1 + a2;
                System.out.println("birinchi san" + s2);

            } else if (a2 > a1) {
                int a3 = a2 * a1;
                System.out.println("ekinchi san " + a3);
            } else {
                System.out.println("tura mes");
            }
        }
    }
}
