import java.util.Scanner;

public class task26 {
    public static void main(String[] args) {
        /** 26. Напишите класс, который принимает с клавиатуры два
         строковых значения, каждое из которых содержит имя человека, и
         проверяет, являются ли эти люди тезками. По результатам
         проверки следует вывести на экран соответствующее сообщение.
         *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("биринчи адамдын атын жазыныз: ");
        String name = scanner.nextLine();
        System.out.println("экинчи адамдын атын жазыыз: ");
        String name1 = scanner.nextLine();

        if(name.equals(name1)) {
            System.out.println("Eki adamdyn attary uikash: " + name + " " + name1);
        } else {
            System.out.println("Adamdardyn attary eki bashka");
        }

    }
}


