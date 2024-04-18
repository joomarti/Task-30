import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        System.out.println("""
                                
                16. Напишите программу, который принимает с клавиатуры целое\s
                число и выводит на экран его квадрат, но только в случае, если\s
                введенное число отрицательно. В противном случае - на экран\s
                выводится сообщение Ошибка.\s
                \s
                17. Напишите программу, который принимает с клавиатуры два\s""");

//
                Scanner scanner =  new Scanner(System.in);
        System.out.println("nomer jaz");
                int number = scanner.nextInt();
                if ((number / 100) % 2 == 0 && ((number / 10) % 10) % 2 == 0 && (number % 10) % 2 == 0) {
                    System.out.println("tak san");

                } else {
                    System.out.println("tura mes");
                }
            }
        }
