package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task6_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введи свое имя: ");
        String name = in.nextLine();

        in.close();

        if (!Objects.equals(name, "Вася")) {
            if (!Objects.equals(name, "Анастасия")) {
                System.out.println("Добрый день, а вы кто?");
            } else {
                System.out.println("Я тебя так долго ждал");
            }
        } else {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
    }
}
