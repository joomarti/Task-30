import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        System.out.println("""
                
                8. Напишите программу, который принимает с клавиатуры целое\s
                число и, если оно положительное, увеличивает его вдвое. Класс\s
                должен выводить на экран новое значение.\s
                \s
                Мисалы: \s
                \s
                Input: 4\s
                Output: 8\s
                \s
                Input: -5\s
                Output: -""");

        Scanner scanner =  new Scanner(System.in);
        int a1;
        int a2 =  0;
        do {
            a1=scanner.nextInt();
            if (a1%2==0){
                System.out.println(a1+a1);
            }else if (a1<0){
                System.out.println(a1);
            }
            a2++;
        }while (a2<=100);
    }
}
