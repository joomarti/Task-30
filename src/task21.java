import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        System.out.println("""
                                
                22. Назовем билет с шестизначным номером «счастливым», если\s
                сумма первых трех его цифр равна сумме последних трех его цифр\s
                и обе эти суммы являются четными.\s
                Напишите класс, который принимает с клавиатуры шестизначный\s
                номер билета и проверяет, является ли он «счастливым» или не\s
                является.\s""");

        Scanner scanner = new Scanner(System.in);
        System.out.println("6 orundu san jaz ");
        String alty;
        do {
            System.out.println("baktulu emes");
            alty =  scanner.nextLine();
            if (!alty.contains("666666")) {

            }
        }while (!alty.contains("666666"));
        System.out.println("baktuluu");

    }}


