import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("""
                
                4. Сиздер консольдон 3 орундуу сан киргизишиниздер керек, ошол\s
                санды сиздер математикалык турдоо консольго чыгарышыныздар\s
                керек\s
                Мисалы:\s
                Input: 364\s
                Output: 300 + 60 + 4\s
            """  );
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите  trri число: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 500) {
            int tens = number / 10 * 10;
            int ones = number % 10*10;
            int a1 = number%10;
            System.out.println("Output: " + tens + " + " + ones+"  "+a1);
        } else {
            System.out.println("Вы ввели неверное число!");
        }
    }
}
