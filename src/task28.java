import java.util.Random;

public class task28 {
    public static void main(String[] args) {
        /** 28. Напишите класс, который генерирует случайное положительное
         двузначное число, а затем генерирует три целых положительных
         числа, меньших первого.

         *
         */

        Random ran = new Random();
        int number = ran.nextInt(10,90);
        System.out.println("Sluchainoe dvuznachnoe chislo " + number);

        int smallerNum1 = ran.nextInt(number - 10) + 1;
        int smallerNum2 = ran.nextInt(number - 10) + 1;
        int smallerNum3 = ran.nextInt(number - 10) + 1;

        System.out.println("Tri sluchainyh chisla, men'shih pervogo: ");
        System.out.println(smallerNum1 + " \n" + smallerNum2 + " \n" + smallerNum3);
    }
}
