package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task6_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введи свое имя: ");
        String name = in.nextLine();

        in.close();

        switch (name) {
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
                break;
        }

    }
}
