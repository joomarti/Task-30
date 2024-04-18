import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        System.out.println("""
                17. Напишите программу, который принимает с клавиатуры два\s
                числа: первое - количество учеников в классе, второе - количество\s
                стульев в классной комнате. Программа проверит соответствие\s
                между этими двумя значениями и выведет на экран\s
                соответствующую информацию (например, для значений\s
                35 и 39 на экран выводится 4 стула лишних""");
        System.out.println();
        System.out.println();
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.print("класстардын окуучулардын сасын жазыныз: ");
        int students = scanner.nextInt();

        System.out.print("класстардын отургучтардын сасын жазыныз: ");
        int chairs = scanner.nextInt();

        if (students > chairs) {
            int extraChairs = students - chairs;
            System.out.println(extraChairs + "  стол жетбей калды");
        } else if (students == chairs) {
            System.out.println(" парта стол жетиштуу");
        } else {
            int missingChairs = chairs - students;
            System.out.println("жетбей калды " + missingChairs + " отургуч");
        }
    }
    }

