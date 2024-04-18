import java.util.Scanner;

public class task4{
    public static void main(String[] args) {
        System.out.println("""
              
                5. Напишите программу, который принимает с клавиатуры целое\s
                положительное двузначное число. Затем следует построить новое\s
                значение, составленное из цифр числа, введенного с клавиатуры,\s
                но в обратном порядке. После этого новое значение следует\s
                увеличить на 8, и окончательный результат вывести на экран.\s
                Мисалы:\s
                \s
                Input: 37\s
                Output: 81\s
                \s
               """);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите  trri число: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 500) {
            int tens = number % 10;
            int ones = number /10;
            int a1 = tens*10+tens;
            System.out.println("Output: " + tens + " + " + ones+"  "+a1);
        } else {
            System.out.println("Вы ввели неверное число!");
        }

    }


}
