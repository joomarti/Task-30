import java.util.Random;
import java.util.Scanner;

public class task30 {
    public static void main(String[] args) {
        Random random = new Random();
        int computerChoice = random.nextInt(3) + 1;

        System.out.println("Тандоо: 1 - таш, 2 - кайчы, 3 - кагаз");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        if (computerChoice == userChoice) {
            System.out.println("Тартуу! Компьютер жана сиз бир эле параметрди тандадыңыз - " + getDescription(computerChoice));
        } else if ((computerChoice == 1 && userChoice == 3) || (computerChoice == 2 && userChoice == 1) || (computerChoice == 3 && userChoice == 2)) {
            System.out.println("Компьютердик жеңиш! Ал тандады " + getDescription(computerChoice) + ", жана сен тандадың" + getDescription(userChoice));
        } else {
            System.out.println("Куттуктайбыз, сиз жеңдиңиз! Сиз тандадыңыз" + getDescription(userChoice) + ", жана компьютер тандады " + getDescription(computerChoice));
        }
    }

    public static String getDescription(int choice) {
        switch (choice) {
            case 1:
                return "таш";
            case 2:
                return "  ножнитси";
            case 3:
                return "бумага";
            default:
                return "";
        }
    }
}

